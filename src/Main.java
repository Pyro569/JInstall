import org.json.simple.parser.ParseException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.lang.String;

class GUI {
    static String user = System.getProperty("user.name");
    static JFrame frame = new JFrame("Test GUI");

    public static void main(String[] args) throws Exception {
        JSON.checkJSON();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);


        frame.setLayout(null);
        frame.setVisible(true);
        buttons();
    }

    static void buttons() {
        JButton installButton = new JButton("Install Minecraft");
        installButton.setSize(300, 100);

        installButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                readJson();
                Download.downloadZipFromURL("https://www.dropbox.com/s/cqub63z5oeexl37/NoJava.zip?dl=1", JSON.installLocation+"/NoJava.zip", JSON.installLocation);
            }
        });

        JButton quitButton = new JButton("Quit");
        quitButton.setSize(300, 100);
        quitButton.setBounds(0,100,300,100);

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.add(installButton);
        frame.add(quitButton);
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

