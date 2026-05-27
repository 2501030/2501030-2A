import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        String path=".\\data\\";
        String fileName = "QRCode01.png";

        File file = new File(path);
        if (file.exists()) {
            ZXingHandler handler = new ZXingHandler();
            handler.decoding(file);
        } else {
            System.out.println("File does not exist");
        }


    }
}