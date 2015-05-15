package apps.FXview.login;

import apps.FXview.login.org.json.simple.JSONArray;
import apps.FXview.login.org.json.simple.JSONObject;
import apps.FXview.login.org.json.simple.parser.JSONParser;
import apps.FXview.login.org.json.simple.parser.ParseException;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by mit_OK! on 14.05.2015.
 * "dmitrii\\src\\main\\resources\\Users.json"
 */
public class JSONProcessor {

    public static ArrayList<User> getUsers (String fileJSONPath){
        JSONParser parser = new JSONParser();
        ArrayList<User> users = new ArrayList<>();
        String json = readJSONfile(fileJSONPath);
        JSONObject jsonObj = null;
        try {
            jsonObj = (JSONObject) parser.parse(json);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        JSONArray jsonUsersArray = (JSONArray) jsonObj.get("users");
        for (Object o : jsonUsersArray){
            JSONObject j = (JSONObject)o;
            User user = new User();
            user.setId(Integer.parseInt(j.get("id").toString()));
            user.setLogin(j.get("login").toString());
            user.setPassword(j.get("password").toString());
            users.add(user);
        }
        return users;
    }
    public static String readJSONfile (String fileJSONPath){
        File file = new File(fileJSONPath);
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String json = "";
        String line;
        try {
            while ((line = bufferedReader.readLine())!=null){
                json += line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }

}
