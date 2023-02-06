import java.awt.*;

public class VariablesJSON {
    //This class will store all the data from the json in variables in order to remove clutter
    static Desktop desktop = Desktop.getDesktop();

    static int screenWidth = (int)JSON.screenWidth;
    static int screenHeight = (int)JSON.screenHeight;
    static int RGBButton1 = (int)JSON.buttonRGBColor1; //red value
    static int RGBButton2 = (int)JSON.buttonRGBColor2; //green value
    static int RGBButton3 = (int)JSON.buttonRGBColor3; //blue value
}