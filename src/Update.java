import java.awt.*;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class Update {
    //this doesnt even work yet
    //TODO: FIX THIS AND GET IT WORKING
    public static void downloadUpdate() throws UnsupportedEncodingException {
        String path = GUI.class.getProtectionDomain().getCodeSource().getLocation().getPath(); //get jar path
        String decodedPath = URLDecoder.decode(path, "UTF-8"); //jar path

        Desktop desktop = Desktop.getDesktop();


        Download.downloadZipFromURL("https://www.dropbox.com/s/tq1byb83xs53c2l/JInstall.zip?dl=1", "C:/users/"+GUI.user+"documents/JInstallUpdate.zip", decodedPath);
        System.exit(0);
    }
}
