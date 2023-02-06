import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamesFrame {
    static JButton minecraftButton = new JButton();
    static JButton uncivButton = new JButton();
    static JButton barotraumaButton = new JButton();
    static JButton turok2Button = new JButton();
    static JButton ultimaButton = new JButton();
    static JButton aloneDarkButton = new JButton();
    static JButton systemShockClassic = new JButton();
    static JButton zomboidButton = new JButton();
    static JButton systemShockEnhanced = new JButton();
    static JButton falloutButton = new JButton();
    static JButton deusExButton = new JButton();
    static JButton armaButton = new JButton();
    //static JButton witcherButton = new JButton();
    static JButton fallout2Button = new JButton();
    static JButton fallout3Button = new JButton();

    public static void buttons() {
        //first column of buttons
        Element.addButton(GUI.gamesFrame, GamesFrame.minecraftButton, "Install Minecraft", 0, 0, 300, 100);
        Element.addButton(GUI.gamesFrame, GamesFrame.barotraumaButton, "Install Barotrauma", 0, 100, 300, 100); //this button does not work atm
        Element.addButton(GUI.gamesFrame, GamesFrame.uncivButton, "Install Unciv", 0, 200, 300, 100);
        Element.addButton(GUI.gamesFrame, GamesFrame.turok2Button, "Install Turok 2", 0, 300, 300, 100); //this button does not work atm
        Element.addButton(GUI.gamesFrame, GamesFrame.ultimaButton, "Install Ultima 1 - 4", 0, 400, 300, 100); //this button does not work atm
        Element.addButton(GUI.gamesFrame, GamesFrame.zomboidButton, "Install Project Zomboid", 0, 500, 300, 100); //this button does not work atm
        Element.addButton(GUI.gamesFrame, GamesFrame.armaButton, "Install ARMA: Cold War Assault", 0, 600, 300, 100); //this button does not work atm

        //second column of buttons
        Element.addButton(GUI.gamesFrame, GamesFrame.aloneDarkButton, "Install Alone in the Dark 1 - 3", 300, 0, 300, 100); //this button does not work currently atm
        Element.addButton(GUI.gamesFrame, GamesFrame.systemShockClassic, "Install System Shock Classic Edition", 300, 100, 300, 100); //this button does not work atm
        Element.addButton(GUI.gamesFrame, GamesFrame.systemShockEnhanced, "Install System Shock Enhanced Edition", 300, 200, 300, 100); //this button does not work atm
        Element.addButton(GUI.gamesFrame, GamesFrame.deusExButton, "Install Deus Ex", 300, 300, 300, 100);
        Element.addButton(GUI.gamesFrame, GamesFrame.falloutButton, "Install Fallout", 300, 400, 300, 100);
        Element.addButton(GUI.gamesFrame, GamesFrame.fallout2Button, "Install Fallout 2", 300, 500, 300, 100);
        //Element.addButton(GUI.gamesFrame, GamesFrame.fallout3Button, "Install Fallout 3", 300, 600, 300, 100);
        //Element.addButton(GUI.gamesFrame, witcherButton, "Install The Witcher: Enhanced Edition", 300, 600, 300, 100);



        addButtonEvents(); //add all the button events
    }
    static public void addButtonEvents() {
        GamesFrame.minecraftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.readJson();
                Download.downloadZipFromURL("https://www.dropbox.com/s/cqub63z5oeexl37/NoJava.zip?dl=1", JSON.installLocation+"/NoJava.zip", JSON.installLocation+"/Minecraft");
            }
        });

        GamesFrame.barotraumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/9t3qga2yp62qxyi/Barotrauma.zip?dl=1", JSON.installLocation+"/Barotrauma.zip", JSON.installLocation+"/Barotrauma");
            }
        });

        GamesFrame.turok2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/mcwgvtv50b0te7d/Turok%202%20-%20Seeds%20of%20Evil.zip?dl=1", JSON.installLocation+"/Turok2.zip", JSON.installLocation+"/Turok 2");
            }
        });

        GamesFrame.ultimaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/wq9lvpu4tlu9i2u/Ultima.zip?dl=1", JSON.installLocation+"/Ultima.zip", JSON.installLocation+"/Ultima");
            }
        });

        GamesFrame.aloneDarkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/4xo44phmmaypl3n/Alone%20in%20the%20Dark%201-3.zip?dl=1", JSON.installLocation+"/Alone.zip", JSON.installLocation+"/Alone in the Dark");
            }
        });

        GamesFrame.systemShockClassic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/p1ocy43fggrs52i/System%20Shock%20-%20Classic%20Edition.zip?dl=1", JSON.installLocation+"/sShock", JSON.installLocation+"/System Shock Classic");
            }
        });

        GamesFrame.systemShockEnhanced.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/01sa9nlri5b56lf/System%20Shock%20Enhanced%20Edition.zip?dl=1", JSON.installLocation+"/sShockEn.zip", JSON.installLocation +"/System Shock Enhanced");
            }
        });

        GamesFrame.zomboidButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/j8ao6j1kqwc07fl/ProjectZomboid.zip?dl=1", JSON.installLocation+"/Zomboid.zip", JSON.installLocation+"/Project Zomboid");
            }
        });

        GamesFrame.falloutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/iuegc4p4xex4lnp/fallout.zip?dl=1", JSON.installLocation+"/fallout.zip", JSON.installLocation+"/Fallout");
            }
        });

        GamesFrame.deusExButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/3vqgdwepkme3r51/Deus%20Ex.zip?dl=1", JSON.installLocation+"/DeusEx.zip", JSON.installLocation+"/Deus Ex");
            }
        });

        GamesFrame.armaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/ea1p7ej9hssb7qq/ARMA.zip?dl=1", JSON.installLocation+"/Arma.zip", JSON.installLocation+"/ARMA");
            }
        });

        //GamesFrame.witcherButton.addActionListener(new ActionListener() {
        //@Override
        //public void actionPerformed(ActionEvent e) {
        //Download.downloadZipFromURL("https://www.dropbox.com/s/2bn2y0fyixx484c/The%20Witcher%20Enhanced%20Edition.zip?dl=1", JSON.installLocation+"/Witcher.zip", JSON.installLocation+"/Witcher");
        //}
        //});

        GamesFrame.fallout2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/2v70w1zcc7nalmo/fallout2.zip?dl=1", JSON.installLocation+"/Fallout2.zip", JSON.installLocation+"/Fallout 2");
            }
        });

        //GamesFrame.fallout3Button.addActionListener(new ActionListener() {
            //@Override
            //public void actionPerformed(ActionEvent e) {
                //Download.downloadZipFromURL("https://www.dropbox.com/s/9zdqipb376jp8bv/fallout3.zip?dl=1", JSON.installLocation+"/Fallout3.zip", JSON.installLocation);
            //}
        //});
    }
}
