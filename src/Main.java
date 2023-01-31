import org.json.simple.parser.ParseException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.String;

class GUI {
    static String user = System.getProperty("user.name"); //this should hopefully be platform independent, test later on windows 10
    static JFrame frame = new JFrame("JInstall");
    static Desktop desktop = Desktop.getDesktop();

    public static void main(String args[]) throws Exception {
        JSON.checkJSON();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 850);

        frame.setLayout(null);
        frame.setVisible(true);
        JSON.readJSON();
        buttons();
    }

    public static void buttons() {
        //first column of buttons
        Element.addButton(frame, minecraftButton, "Install Minecraft", 0, 0, 300, 100);
        Element.addButton(frame, barotraumaButton, "Install Barotrauma", 0, 100, 300, 100); //this button does not work atm
        Element.addButton(frame, uncivButton, "Install Unciv", 0, 200, 300, 100);
        Element.addButton(frame, turok2Button, "Install Turok 2", 0, 300, 300, 100); //this button does not work atm
        Element.addButton(frame, ultimaButton, "Install Ultima 1 - 4", 0, 400, 300, 100); //this button does not work atm
        Element.addButton(frame, zomboidButton, "Install Project Zomboid", 0, 500, 300, 100); //this button does not work atm
        Element.addButton(frame, armaButton, "Install ARMA: Cold War Assault", 0, 600, 300, 100); //this button does not work atm
        Element.addButton(frame, witcherButton, "Install The Witcher: Enhanced Edition", 0, 700, 300, 100); //this button does not work atm

        //second column of buttons
        Element.addButton(frame, aloneDarkButton, "Install Alone in the Dark 1 - 3", 300, 0, 300, 100); //this button does not work currently atm
        Element.addButton(frame, systemShockClassic, "Install System Shock Classic Edition", 300, 100, 300, 100); //this button does not work atm
        Element.addButton(frame, systemShockEnhanced, "Install System Shock Enhanced Edition", 300, 200, 300, 100); //this button does not work atm
        Element.addButton(frame, deusExButton, "Install Deus Ex", 300, 300, 300, 100);
        Element.addButton(frame, falloutButton, "Install Fallout", 300, 400, 300, 100);
        Element.addButton(frame, fallout2Button, "Install Fallout 2", 300, 500, 300, 100);

        //third column of buttons
        Element.addButton(frame, quitButton, "Quit", 600, 0, 300, 100);
        Element.addButton(frame, jsonEditButton, "Edit Config JSON", 600, 100, 300, 100);
        Element.addButton(frame, downloadUpdate, "Update JInstall", 600, 200, 300, 100);

        Buttons.addButtonEvents(); //add all the button events
    }
    public static void readJson() {
        try {
            JSON.readJSON();
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static JButton minecraftButton = new JButton();
    static JButton quitButton = new JButton();
    static JButton uncivButton = new JButton();
    static JButton barotraumaButton = new JButton();
    static JButton turok2Button = new JButton();
    static JButton ultimaButton = new JButton();
    static JButton jsonEditButton = new JButton();
    static JButton downloadUpdate = new JButton();
    static JButton aloneDarkButton = new JButton();
    static JButton systemShockClassic = new JButton();
    static JButton zomboidButton = new JButton();
    static JButton systemShockEnhanced = new JButton();
    static JButton falloutButton = new JButton();
    static JButton deusExButton = new JButton();
    static JButton armaButton = new JButton();
    static JButton witcherButton = new JButton();
    static JButton fallout2Button = new JButton();
}

