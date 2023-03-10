import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ConfigTab {
    static JButton jsonEditButton = new JButton();
    static JButton downloadUpdate = new JButton();
    static JButton quitButton = new JButton();
    static JButton restartButton = new JButton();
    static  JButton mainMenuButton = new JButton();

    public static void addConfigButtons() {
        Element.addButton(GUI.configFrame, jsonEditButton, "Open Config JSON", 0, 0, 300, 100);
        Element.addButton(GUI.configFrame, downloadUpdate, "Update JInstall", 0, 100, 300, 100);
        Element.addButton(GUI.configFrame, quitButton, "Quit JInstall", 0, 200, 300, 100);
        Element.addButton(GUI.configFrame, restartButton, "Restart JInstall", 0, 300, 300, 100);
        Element.addButton(GUI.configFrame, mainMenuButton, "JInstall Main Menu", 0, 400, 300, 100);

        jsonEditButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File jsonFile = new File(JSON.JSONPath);
                try {
                    VariablesJSON.desktop.open(jsonFile);
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

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        mainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.configFrame.setVisible(false);
                try {
                    GUI.start();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}
