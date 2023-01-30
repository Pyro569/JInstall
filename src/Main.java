import org.json.simple.parser.ParseException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.lang.String;
import java.awt.desktop.*;


class GUI {
    static JFrame frame = new JFrame("JInstall");
    static Desktop desktop = Desktop.getDesktop();
    public static void main(String[] args) throws Exception {
        JSON.checkJSON();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        frame.setLayout(null);
        frame.setVisible(true);
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
                    File jsonFile = new File("C:/windows/tracing/JInstall.json");
                try {
                    desktop.open(jsonFile);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        frame.add(installButton);
        frame.add(quitButton);
        frame.add(uncivButton);
        frame.add(barotraumaButton);
        frame.add(jsonEditButton);
    }


    public static void readJson() {
        try {
            JSON.readJSON();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }
}

