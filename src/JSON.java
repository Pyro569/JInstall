import java.io.*;
import org.json.simple.JSONObject;
import java.lang.String;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

public class JSON {
    static JSONObject jsonObject = new JSONObject();
    public static String installLocation = "";
    static String JSONPath = "C:\\Users\\"+GUI.user+"\\Documents/JInstall.json";
    static File JSONFile = new File(JSONPath);
    static long buttonRGBColor1 = 1;
    static long buttonRGBColor2 = 1;
    static long buttonRGBColor3 = 1;
    static long jsonVersion = 1;
    public static void create() throws Exception {

        jsonObject.put("Install Location", "C:\\windows\\tracing\\JInstall");
        jsonObject.put("ButtonColorRGB1", 255);
        jsonObject.put("ButtonColorRGB2", 255);
        jsonObject.put("ButtonColorRGB3", 255);
        jsonObject.put("Json Version", 1);
        try {
            FileWriter file = new FileWriter("C:\\Users\\"+GUI.user+"\\Documents/JInstall.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("JSON file created: "+jsonObject);
        readJSON();
    }
    public static void checkJSON() throws Exception {
        String jsonPath = "C:\\Users\\"+GUI.user+"\\Documents/JInstall.json";
        File JSONLocation = new File(jsonPath);
        if (JSONLocation.exists()){
            if(jsonVersion != 1){ //if json version is not the "newest" delete and make new one, deletes data
                //TODO: SAVE DATA FROM JSON BEFORE DELETING
                JSONLocation.delete();
                create();
            }else{//if json version is newest, read it
                readJSON();
            }
        }else{ //if json doesn't exist create it
            create();
        }
    }
    public static void readJSON() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        FileReader jsonReader = new FileReader(JSONFile);
        JSONObject json = (JSONObject) parser.parse(jsonReader);
        installLocation = (String) json.get("Install Location");
        buttonRGBColor1 = (long) json.get("ButtonColorRGB1"); //red value
        buttonRGBColor2 = (long) json.get("ButtonColorRGB2"); //green value
        buttonRGBColor3 = (long) json.get("ButtonColorRGB3"); //blue value
        jsonVersion = (long) json.get("Json Version");
    }
}