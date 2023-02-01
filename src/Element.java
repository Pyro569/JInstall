import javax.swing.*;
import java.awt.*;

public class Element {
    public static void addButton(JFrame frame, JButton button, String buttonText, int xBounds, int yBounds, int width, int height){
        button.setText(buttonText);
        button.setBounds(xBounds, yBounds, width, height);
        button.setBackground(new Color(variablesJSON.RGBButton1, variablesJSON.RGBButton2, variablesJSON.RGBButton3));
        frame.add(button);
    }
}
