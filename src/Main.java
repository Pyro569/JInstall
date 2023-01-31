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

    static void buttons() {
        JButton minecraftButton = new JButton();
        JButton quitButton = new JButton();
        JButton uncivButton = new JButton();
        JButton barotraumaButton = new JButton();
        JButton turok2Button = new JButton();
        JButton ultimaButton = new JButton();
        JButton jsonEditButton = new JButton();
        JButton downloadUpdate = new JButton();
        JButton aloneDarkButton = new JButton();
        JButton systemShockClassic = new JButton();
        JButton zomboidButton = new JButton();
        JButton systemShockEnhanced = new JButton();
        JButton falloutButton = new JButton();
        JButton deusExButton = new JButton();
        JButton armaButton = new JButton();
        JButton witcherButton = new JButton();
        JButton fallout2Button = new JButton();

        minecraftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                readJson();
                Download.downloadZipFromURL("https://www.dropbox.com/s/cqub63z5oeexl37/NoJava.zip?dl=1", JSON.installLocation+"/NoJava.zip", JSON.installLocation+"/Minecraft");
            }
        });

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        uncivButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/iafja8hz7wn4n0g/unciv-windows64.zip?dl=1", JSON.installLocation+"/Unciv.zip", JSON.installLocation+"/Unciv");
            }
        });

        barotraumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/3kc9e1t3jhe1vuw/Barotrauma.zip?dl=1", JSON.installLocation+"/Barotrauma.zip", JSON.installLocation+"/Barotrauma");
            }
        });

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

        turok2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/mcwgvtv50b0te7d/Turok%202%20-%20Seeds%20of%20Evil.zip?dl=1", JSON.installLocation+"/Turok2.zip", JSON.installLocation+"/Turok 2");
            }
        });

        ultimaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/wq9lvpu4tlu9i2u/Ultima.zip?dl=1", JSON.installLocation+"/Ultima.zip", JSON.installLocation);
            }
        });

        aloneDarkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/4xo44phmmaypl3n/Alone%20in%20the%20Dark%201-3.zip?dl=1", JSON.installLocation+"/Alone.zip", JSON.installLocation);
            }
        });

        systemShockClassic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/p1ocy43fggrs52i/System%20Shock%20-%20Classic%20Edition.zip?dl=1", JSON.installLocation+"/sShock", JSON.installLocation);
            }
        });

        systemShockEnhanced.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/01sa9nlri5b56lf/System%20Shock%20Enhanced%20Edition.zip?dl=1", JSON.installLocation+"/sShockEn.zip", JSON.installLocation);
            }
        });

        zomboidButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/j8ao6j1kqwc07fl/ProjectZomboid.zip?dl=1", JSON.installLocation+"/Zomboid.zip", JSON.installLocation);
            }
        });

        falloutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/iuegc4p4xex4lnp/fallout.zip?dl=1", JSON.installLocation+"/fallout.zip", JSON.installLocation);
            }
        });

        deusExButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/3vqgdwepkme3r51/Deus%20Ex.zip?dl=1", JSON.installLocation+"/DeusEx.zip", JSON.installLocation);
            }
        });

        armaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/ea1p7ej9hssb7qq/ARMA.zip?dl=1", JSON.installLocation+"/Arma.zip", JSON.installLocation);
            }
        });

        witcherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/2bn2y0fyixx484c/The%20Witcher%20Enhanced%20Edition.zip?dl=1", JSON.installLocation+"/Witcher.zip", JSON.installLocation);
            }
        });

        fallout2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/4l9htnukmkzuvjm/fallout2.zip?dl=1", JSON.installLocation+"/Fallout2.zip", JSON.installLocation);
            }
        });

        //first column of buttons
        Element.addButton(frame, minecraftButton, "Install Minecraft", 0, 0, 300, 100);
        Element.addButton(frame, barotraumaButton, "Install Barotrauma", 0, 100, 300, 100);
        Element.addButton(frame, uncivButton, "Install Unciv", 0, 200, 300, 100);
        Element.addButton(frame, turok2Button, "Install Turok 2", 0, 300, 300, 100);
        Element.addButton(frame, ultimaButton, "Install Ultima 1 - 4", 0, 400, 300, 100);
        Element.addButton(frame, zomboidButton, "Install Project Zomboid", 0, 500, 300, 100);
        Element.addButton(frame, armaButton, "Install ARMA: Cold War Assault", 0, 600, 300, 100);
        Element.addButton(frame, witcherButton, "Install The Witcher: Enhanced Edition", 0, 700, 300, 100);

        //second column of buttons
        Element.addButton(frame, aloneDarkButton, "Install Alone in the Dark 1 - 3", 300, 0, 300, 100);
        Element.addButton(frame, systemShockClassic, "Install System Shock Classic Edition", 300, 100, 300, 100);
        Element.addButton(frame, systemShockEnhanced, "Install System Shock Enhanced Edition", 300, 200, 300, 100);
        Element.addButton(frame, deusExButton, "Install Deus Ex", 300, 300, 300, 100);
        Element.addButton(frame, falloutButton, "Install Fallout", 300, 400, 300, 100);
        Element.addButton(frame, fallout2Button, "Install Fallout 2", 300, 500, 300, 100);

        //third column of buttons
        Element.addButton(frame, quitButton, "Quit", 600, 0, 300, 100);
        Element.addButton(frame, jsonEditButton, "Edit Config JSON", 600, 100, 300, 100);
        Element.addButton(frame, downloadUpdate, "Update JInstall", 600, 200, 300, 100);
    }
    public static void readJson() {
        try {
            JSON.readJSON();
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }
}

