import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path=".\\data\\";
        String fileName = "barcode128(text).png";
        Scanner keyboard = new Scanner(System.in);
        String data = "";

        while(true){
            System.out.print("QRCODE 텍스트 입력 : ");
            data = keyboard.nextLine();
            if (data.equals("")){
                break;
            }
        }

        ZXingHandler handler = new ZXingHandler();
        handler.encoding(data,path + fileName);
    }
}