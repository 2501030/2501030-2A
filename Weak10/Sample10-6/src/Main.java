import java.io.*;
import java.nio.charset.Charset;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        String filePath = ".\\data\\Sample.txt";
        String outputPath = ".\\data\\Sample_copy.txt";
        int count = 0;

        File file = new File(filePath);
        if (file.exists()) {
            System.out.printf("%s File이 존재합니다.\n", filePath);
            try {
                FileReader fileReader = new FileReader(file, Charset.defaultCharset());
                FileWriter fileWriter = new FileWriter(outputPath, Charset.defaultCharset());
                int ch;
                while ((ch = fileReader.read()) != -1) {
                    count++;
                    fileWriter.write(ch);
                }
                System.out.printf("%,d Bytes 복사\n", count);
                fileReader.close();
                fileWriter.close();
                Runtime.getRuntime().exec("noteped.exe", + outputPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.printf("%s File이 존재하지 않습니다.\n", filePath);
        }
    }
}