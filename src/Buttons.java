import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Buttons {
    static public void addButtonEvents() {
        GUI.minecraftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.readJson();
                Download.downloadZipFromURL("https://www.dropbox.com/s/cqub63z5oeexl37/NoJava.zip?dl=1", JSON.installLocation+"/NoJava.zip", JSON.installLocation+"/Minecraft");
            }
        });

        GUI.quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });



        GUI.barotraumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/3kc9e1t3jhe1vuw/Barotrauma.zip?dl=1", JSON.installLocation+"/Barotrauma.zip", JSON.installLocation+"/Barotrauma");
            }
        });

        GUI.jsonEditButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File jsonFile = new File("C:\\Users\\"+GUI.user+"\\Documents/JInstall.json");
                try {
                    GUI.desktop.open(jsonFile);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        GUI.downloadUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Update.downloadUpdate();
                } catch (UnsupportedEncodingException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        GUI.turok2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/mcwgvtv50b0te7d/Turok%202%20-%20Seeds%20of%20Evil.zip?dl=1", JSON.installLocation+"/Turok2.zip", JSON.installLocation+"/Turok 2");
            }
        });

        GUI.ultimaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/wq9lvpu4tlu9i2u/Ultima.zip?dl=1", JSON.installLocation+"/Ultima.zip", JSON.installLocation+"/Ultima");
            }
        });

        GUI.aloneDarkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/4xo44phmmaypl3n/Alone%20in%20the%20Dark%201-3.zip?dl=1", JSON.installLocation+"/Alone.zip", JSON.installLocation+"/Alone in the Dark");
            }
        });

        GUI.systemShockClassic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/p1ocy43fggrs52i/System%20Shock%20-%20Classic%20Edition.zip?dl=1", JSON.installLocation+"/sShock", JSON.installLocation+"/System Shock Classic");
            }
        });

        GUI.systemShockEnhanced.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/01sa9nlri5b56lf/System%20Shock%20Enhanced%20Edition.zip?dl=1", JSON.installLocation+"/sShockEn.zip", JSON.installLocation +"/System Shock Enhanced");
            }
        });

        GUI.zomboidButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/j8ao6j1kqwc07fl/ProjectZomboid.zip?dl=1", JSON.installLocation+"/Zomboid.zip", JSON.installLocation+"/Project Zomboid");
            }
        });

        GUI.falloutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/iuegc4p4xex4lnp/fallout.zip?dl=1", JSON.installLocation+"/fallout.zip", JSON.installLocation+"/Fallout");
            }
        });

        GUI.deusExButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/3vqgdwepkme3r51/Deus%20Ex.zip?dl=1", JSON.installLocation+"/DeusEx.zip", JSON.installLocation+"/Deus Ex");
            }
        });

        GUI.armaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/ea1p7ej9hssb7qq/ARMA.zip?dl=1", JSON.installLocation+"/Arma.zip", JSON.installLocation+"/ARMA");
            }
        });

        GUI.witcherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/2bn2y0fyixx484c/The%20Witcher%20Enhanced%20Edition.zip?dl=1", JSON.installLocation+"/Witcher.zip", JSON.installLocation+"/Witcher");
            }
        });

        GUI.fallout2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/4l9htnukmkzuvjm/fallout2.zip?dl=1", JSON.installLocation+"/Fallout2.zip", JSON.installLocation+"/Fallout 2");
            }
        });
    }
}
