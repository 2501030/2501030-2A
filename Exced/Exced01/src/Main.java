import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        String page = "https://192.168.159.1:8083/student.xlsx";
        ArrayList<String> students;

        try {
            URL url = new URL(page);
            ExcedInputHandler inputHandler = new ExcedInputHandler();
            students = inputHandler.readExcel(url);


        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}