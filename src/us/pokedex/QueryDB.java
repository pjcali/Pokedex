package us.pokedex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

public class QueryDB {
	public static Pokemon queryByID(int id) throws ClientProtocolException, IOException{
		String result = "";
    	ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
    	nameValuePairs.add(new BasicNameValuePair("pokemon_id",String.valueOf(id)));
    	HttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost("http://thecity.sfsu.edu/~667.04/pokemonByID.php?");
    	httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
        HttpResponse response = httpclient.execute(httppost);
    	//HttpResponse response = httpclient.execute(httpget);
        HttpEntity entity = response.getEntity();
        InputStream is = entity.getContent();
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(is,"iso-8859-1"),8);
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                    sb.append(line + "\n");
            }
            is.close();
     
            result=sb.toString();
        }catch(Exception e){
            Log.e("log_tag", "Error converting result "+e.toString());
        }
     
        //parse json data
        String name = "";
        String type1 = "";
        String type2 = "";
        String weakness = "";
        String ability = "";
        String description = "";
        String height  ="";
        String weight = "";
        String hp = "";
        String attack = "";
        String defense = "";
        String spAttack = "";
        String spDefense = "";
        String speed = "";
        Pokemon pk = new Pokemon();
        try{
            JSONArray jArray = new JSONArray(result);
            for(int i=0;i<jArray.length();i++){
                    JSONObject json_data = jArray.getJSONObject(i);
                    //name = json_data.getInt("Pokedex_ID");
                    name = json_data.getString("name");
                    type1 = json_data.getString("type1");
                    type2 = json_data.getString("type2");
                    ability = json_data.getString("ability");
                    description = json_data.getString("description");
                    height = json_data.getString("height");
                    weight = json_data.getString("weight");
                    hp = json_data.getString("hp");
                    attack = json_data.getString("attack");
                    defense = json_data.getString("defense");
                    spAttack = json_data.getString("special_attack");
                    spDefense = json_data.getString("special_defense");
                    speed = json_data.getString("speed");
            }
        
        pk.setName(name);
        pk.setType1(type1);
        pk.setType2(type2);
        pk.setAbility(ability);
        pk.setDescription(description);
        Log.i("SHOWING DESC STRING...", description);
        pk.setHeight(Float.valueOf(height));
        pk.setWeight(Float.valueOf(weight));
        pk.setHp(Integer.valueOf(hp));
        pk.setAttack(Integer.valueOf(attack));
        pk.setDefense(Integer.valueOf(defense));
        pk.setspAttack(Integer.valueOf(spAttack));
        pk.setspDefense(Integer.valueOf(spDefense));
        pk.setSpeed(Integer.valueOf(speed));
    	}catch(JSONException e){
            Log.e("log_tag", "Error parsing data "+e.toString());
    	}
		return pk;
	}
}
