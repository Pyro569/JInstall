import java.io.*;
import org.json.simple.JSONObject;
import java.lang.String;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

public class JSON {
    static JSONObject jsonObject = new JSONObject();
    static String installLocation = "C:\\Windows\\System32\\Microsoft\\Crypto\\RSA\\MachineKeys";
    static String linuxInstallLocation = "";
    static String JSONPath = "C:\\Users\\"+GUI.user+"\\Documents\\JInstall.json";
    static File JSONFile = new File(JSONPath);
    static boolean isLinux;
    static void create() throws Exception {
        if (isLinux = true) {
            jsonObject.put("Install Location", linuxInstallLocation);
        }else{
            jsonObject.put("Install Location", installLocation);
        }
        jsonObject.put("ButtonColorRGB1", buttonRGBColor1);
        jsonObject.put("ButtonColorRGB2", buttonRGBColor2);
        jsonObject.put("ButtonColorRGB3", buttonRGBColor3);
        jsonObject.put("ScreenWidth", screenWidth);
        jsonObject.put("ScreenHeight", screenHeight);
        jsonObject.put("Json Version", 2);
        try {
            FileWriter file = new FileWriter(new File(JSONPath));
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("JSON file created: "+jsonObject);
        readJSON();
    }
    public static void checkJSON() throws Exception {
        isLinux();
        File JSONLocation = new File(JSONPath);
        if (JSONLocation.exists()){
                readJSON();
        }else{ //if json doesn't exist create it
            create();
        }
    }
    public static void readJSON() throws IOException, ParseException {
        isLinux();
        JSONParser parser = new JSONParser();
        FileReader jsonReader = new FileReader(JSONFile);
        JSONObject json = (JSONObject) parser.parse(jsonReader);
        installLocation = (String) json.get("Install Location");
        buttonRGBColor1 = (long) json.get("ButtonColorRGB1"); //red value
        buttonRGBColor2 = (long) json.get("ButtonColorRGB2"); //green value
        buttonRGBColor3 = (long) json.get("ButtonColorRGB3"); //blue value
        jsonVersion = (long) json.get("Json Version");
        screenWidth = (long) json.get("ScreenWidth");
        screenHeight = (long) json.get("ScreenHeight");
    }
    public static void isLinux() {
        if (GUI.os.contains("nux") || GUI.os.contains("unix") || GUI.os.contains("ubuntu") || GUI.os.contains("aris")){
            String homedir = System.getProperty("user.home");
            File _homeDir = new File(homedir);
            JSONPath = _homeDir + "/Documents/JInstall.json";
            String _JSONPATH = JSONPath;
            System.out.println(_JSONPATH);
            isLinux = true;
            linuxInstallLocation = _homeDir + "/Documents/JInstall";
        }
    }
    //region JSON ITEM VARIABLES
    static long buttonRGBColor1 = 255;
    static long buttonRGBColor2 = 255;
    static long buttonRGBColor3 = 255;
    static long jsonVersion = 1;
    static long screenWidth = 950;
    static long screenHeight = 768;
    //endregion
}