import javax.swing.*;
import java.awt.*;

public class Element {
    public static void addButton(JFrame frame, JButton button, String buttonText, int xBounds, int yBounds, int width, int height){
        button.setText(buttonText);
        button.setBounds(xBounds, yBounds, width, height);
        int RGBButton1 = (int)JSON.buttonRGBColor1;
        int RGBButton2 = (int)JSON.buttonRGBColor2;
        int RGBButton3 = (int)JSON.buttonRGBColor3;
        button.setBackground(new Color(RGBButton1, RGBButton2, RGBButton3));
        frame.add(button);
    }
}
