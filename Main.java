import org.apache.commons.io.FileUtils;
import java.io.IOException;
import java.net.URL;
import java.io.File;
import javax.swing.*;
import java.awt.event.*;
import java.lang.String;
import java.net.URLConnection;

class GUI {
    static String user = System.getProperty("user.name");
    String downloadsDirectory = "C:/users/"+user+"/Downloads";

    public static void main(String[] args) throws IOException{
        JFrame frame = new JFrame("Test GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        JButton button = new JButton("Press");

        button.setBounds(150, 200, 220, 50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Download.downloadZipFromURL("https://www.dropbox.com/s/cqub63z5oeexl37/NoJava.zip?dl=1", "C:/users/"+user+"/Downloads/Minecraft.zip", "C:/users/"+user+"/Downloads/JInstallTest/Minecraft");
            }
        });

        frame.add(button);
        frame.setVisible(true);
    }

}
