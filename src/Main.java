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
        frame.setSize(600, 600);

        frame.setLayout(null);
        frame.setVisible(true);
        JSON.readJSON();
        buttons();
    }

    static <bool> void buttons() {
        JButton installButton = new JButton("Install Minecraft");
        installButton.setSize(300, 100);

        installButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                readJson();
                Download.downloadZipFromURL("https://www.dropbox.com/s/cqub63z5oeexl37/NoJava.zip?dl=1", JSON.installLocation+"/NoJava.zip", JSON.installLocation+"/Minecraft");
            }
        });

        JButton quitButton = new JButton("Quit");
        quitButton.setSize(300, 100);
        quitButton.setBounds(300,0,300,100);

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JButton uncivButton = new JButton("Install Unciv");
        uncivButton.setSize(300, 100);
        uncivButton.setBounds(0, 100, 300, 100);

        uncivButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/iafja8hz7wn4n0g/unciv-windows64.zip?dl=1", JSON.installLocation+"/Unciv.zip", JSON.installLocation+"/Unciv");
            }
        });

        JButton barotraumaButton = new JButton("Install Barotrauma");
        barotraumaButton.setSize(300, 100);
        barotraumaButton.setBounds(0, 200, 300, 100);

        barotraumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/3kc9e1t3jhe1vuw/Barotrauma.zip?dl=1", JSON.installLocation+"/Barotrauma.zip", JSON.installLocation);
            }
        });

        JButton jsonEditButton = new JButton("Open Config JSON");
        jsonEditButton.setSize(300, 100);
        jsonEditButton.setBounds(300, 100, 300, 100);

        jsonEditButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    File jsonFile = new File("C:\\Users\\"+GUI.user+"\\Documents/JInstall.json");
                try {
                    desktop.open(jsonFile);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        JButton downloadUpdate = new JButton("Update JInstall");
        downloadUpdate.setSize(300, 100);
        downloadUpdate.setBounds(300, 200, 300, 100);

        downloadUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Update.downloadUpdate();
                } catch (UnsupportedEncodingException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        addButton(frame, installButton);
        addButton(frame, quitButton);
        addButton(frame, uncivButton);
        addButton(frame, barotraumaButton);
        addButton(frame, jsonEditButton);
        addButton(frame, downloadUpdate);
    }
    public static void readJson() {
        try {
            JSON.readJSON();
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public static void colorizeButton(JButton button){
        int RGBButton1 = (int)JSON.buttonRGBColor1;
        int RGBButton2 = (int)JSON.buttonRGBColor2;
        int RGBButton3 = (int)JSON.buttonRGBColor3;
        button.setBackground(new Color(RGBButton1, RGBButton2, RGBButton3));
    }

    public static void addButton(JFrame frame, JButton button){
        frame.add(button);
        colorizeButton(button);
    }
}

