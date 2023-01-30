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
    public static String buttonColorTheme = "";
    static String JSONPath = "C:\\Users\\"+GUI.user+"\\Documents/JInstall.json";
    static File JSONFile = new File(JSONPath);
    static long buttonRGBColor1 = 1;
    static long buttonRGBColor2 = 1;
    static long buttonRGBColor3 = 1;
    static String jsonVersion = "";
    public static void create() throws Exception {

        jsonObject.put("Install Location", "C:\\Users\\"+GUI.user+"\\Documents\\");
        //jsonObject.put("Button Theme", "1"); temporarily removed in favor of rgb values
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
            readJSON();
        }else{
            create();
        }
    }

    public static void readJSON() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        FileReader jsonReader = new FileReader(JSONFile);
        JSONObject json = (JSONObject) parser.parse(jsonReader);
        installLocation = (String) json.get("Install Location");
        //buttonColorTheme = (String) json.get("Button Theme"); temporarily removed in favor of rgb values
        buttonRGBColor1 = (long) json.get("ButtonColorRGB1");
        buttonRGBColor2 = (long) json.get("ButtonColorRGB2");
        buttonRGBColor3 = (long) json.get("ButtonColorRGB3");
    }
}