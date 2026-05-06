import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        String filePath = ".\\data\\Sample.txt";
        String outputPath = ".\\data\\Sample_copy.txt";
        int count = 0;
        int lineCount = 0;

        File file = new File(filePath);
        if (file.exists()) {
            System.out.printf("%s File이 존재합니다.\n", filePath);
            try {
                Scanner fileReader = new Scanner(file, StandardCharsets.UTF_8);
                PrintWriter printWriter = new PrintWriter(outputPath, Charset.defaultCharset());

                String line;
                while (fileScanner.hasNextLine()) {
                    line = fileScanner.nextLine();
                    printWriter.println(line);
                    lineCount++;
                    count += line.length() = 1;
                }

                System.out.printf("%,d Bytes 복사 (%,d Lines)\n", count, lineCount);
                fileScanner.close();
                PrintWriter.close();
                Runtime.getRuntime().exec("noteped.exe" + outputPath);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.printf("%s File이 존재하지 않습니다.\n", filePath);
        }
    }
}