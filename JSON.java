import java.io.*;
import org.json.simple.JSONObject;
import java.lang.String;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSON {
    static JSONObject jsonObject = new JSONObject();
    public static String installLocation = "";
    public static String buttonColorTheme = "";
    public static void create() throws Exception {

        jsonObject.put("Install Location", "C:/windows/tracing/JInstall");
        jsonObject.put("Button Color Theme", "1");
        try {
            FileWriter file = new FileWriter("C:/windows/tracing/JInstall.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("JSON file created: "+jsonObject);
        readJSON();
    }

    public static void setVars() throws Exception {

    }

    public static void checkJSON() throws Exception {
        String jsonPath = "C:/windows/tracing/JInstall.json";
        File JSONLocation = new File(jsonPath);
        if (JSONLocation.exists()){
            readJSON();
        }else{
            create();
        }
    }

    public static void readJSON() throws IOException, ParseException {
        String JSONPath = "C:/windows/tracing/JInstall.json";
        File JSONFile = new File(JSONPath);
        JSONParser parser = new JSONParser();
        FileReader jsonReader = new FileReader(JSONFile);
        JSONObject json = (JSONObject) parser.parse(jsonReader);
        installLocation = (String) json.get("Install Location");
        buttonColorTheme = (String)json.get("Button Color Theme");
    }
    public static void main(String args[]) throws Exception {
        checkJSON();
    }
}