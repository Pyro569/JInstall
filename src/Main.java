import org.json.simple.parser.ParseException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.lang.String;

class GUI {
    static String user = System.getProperty("user.name"); //this should hopefully be platform independent, test later on windows 10
    static JFrame mainFrame = new JFrame("JInstall");
    static String os = System.getProperty("os.name");
    static JFrame gamesFrame = new JFrame("Games Library");
    static JFrame configFrame = new JFrame("JInstall Config");
    static JFrame softwareFrame = new JFrame("Software Library");

    public static void main(String args[]) throws Exception {
        start();
    }

    static void start() throws Exception{
        //TODO: MAKE FRAME LAYOUT BASED ON JSON FILE
        if (os.contains("nux") || os.contains("unix") || os.contains("ubuntu") || os.contains("aris")){
            System.out.println("Detected unix operating system...");
            JSON.isLinux = true;
            String homedir = System.getProperty("user.home");
            File _homeDir = new File(homedir);
            JSON.JSONPath = _homeDir + "/Documents/JInstall.json";
        }
        JSON.checkJSON();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(VariablesJSON.screenWidth, VariablesJSON.screenHeight);
        mainFrame.setLayout(null); //TODO: MAKE FRAME LAYOUT BASED ON JSON FILE
        mainFrame.setVisible(true);
        JSON.readJSON();
        addMainButtons(mainFrame);
    }

    static void readJson() {
        try {
            JSON.readJSON();
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static void addMainButtons(JFrame frame){
        JButton gamesButton = new JButton();
        JButton softwareButton = new JButton();
        JButton exitButton = new JButton();
        JButton configButton = new JButton();

        Element.addButton(mainFrame, gamesButton, "Install Games", 0, 0, 300, 100);
        Element.addButton(mainFrame, softwareButton, "Install Software", 0, 100, 300, 100);
        Element.addButton(mainFrame, configButton, "JInstall Configuration", 0, 200, 300, 100);
        Element.addButton(mainFrame, exitButton, "Exit JInstall", 0, 300, 300, 100);

        //slightly cluttered but is better to have buttons down here instead of static at the top
        gamesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.setVisible(false);
                gamesFrame.setVisible(true);
                gamesFrame.setSize(VariablesJSON.screenWidth, VariablesJSON.screenHeight);
                gamesFrame.setLayout(null);
                GamesFrame.buttons();
            }
        });

        softwareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.setVisible(false);
                softwareFrame.setVisible(true);
            }
        });

        configButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.setVisible(false);
                configFrame.setVisible(true);
                configFrame.setSize(VariablesJSON.screenWidth, VariablesJSON.screenHeight);
                configFrame.setLayout(null);
                ConfigTab.addConfigButtons();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exiting JInstall...");
                System.exit(0);
            }
        });
    }
}

