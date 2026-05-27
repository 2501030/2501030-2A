import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        String path=".\\data\\";
        String fileName = "barcode128(text).png";

        File file = new File(path + fileName);
        if (file.exists()) {
            ZXingHandler handler = new ZXingHandler();
            handler.decoding(file);
        } else {
            System.out.println("파일이 존재하지 않아요");
        }
    }
}