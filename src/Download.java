import org.apache.commons.io.FileUtils;
import java.net.URL;
import java.io.File;
public class Download {

    //public static void downloadFileFromURL(String url, String destination){
        //try {
            //URL downloadURL = new URL(url);
            //File downloadDestination = new File(destination);
            //FileUtils.copyURLToFile(downloadURL, downloadDestination);
            //System.out.println("Successfully downloaded file from URL to " + destination);
        //}catch (Exception a){
            //System.out.println("Failed to download file from URL");
        //}
    //}

    public static void downloadZipFromURL(String url, String destination, String unzipDestination){
        try {
            URL downloadURL = new URL(url);
            File downloadDestination = new File(destination);
            FileUtils.copyURLToFile(downloadURL, downloadDestination);
            System.out.println("Successfully downloaded zip file from URL to " + destination);
            try{
                String zipPath = new String(destination);
                Unzip.unzip(zipPath, unzipDestination);
                System.out.println("Successfully extracted zip file to " + unzipDestination);
                File deleteZIP = new File(destination);
                deleteZIP.delete();
            }catch (Exception b){
                System.out.println("Failed to extract zip file from destination");
            }
        }catch (Exception a){
            System.out.println("Failed to download zip file from URL");
        }
    }
}
