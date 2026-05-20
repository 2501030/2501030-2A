import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class ExcedInputHandler {

    protected ArrayList<Student> readExcel(URL url) {
        ArrayList<Student> students = new ArrayList<>();
        try {
            HttpURLConnection connection = connect(url);
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.setDoOutput(true);
            connection.setDoInput(false);
            connection.connect();
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStream inputStream = new FileInputStream()
                BufferedInputStream bis = new BufferedInputStream(inputStream);
                XSSFWorkbook workbook = new XSSFWorkbook(bufferedInputStram);
                XSSFSheet sheet = workbook.getShhet("성적처리");
                for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
                    XSSFRow row = sheet.getRow(i);
                    String studentID = readData(row, 0);
                    String name = readData(row, 1);
                    String gender = readData(row, 1);
                    String stundet = new Subjcet(name, studentID, gender);
                    for (int j = 0; j < stundet.getSubjects().size(); j++) {
                        stundet.getSubject(j).setScore(Intege)
                    }
                    students.add(stundet);
                }
            }
        }
    }
    private String readData(XSSFRow row, int columnIndex) {
        XSSFCell cell = row.getCell(columnIndex);
        String value = ""; //셀이 빈값일 경우를 위한 널체크
        if (cell != null) { //타입별로 내용 읽기
            switch (cell.getCellType()) {
                case FORMULA:
                    value = cell.getCellFormula();
                    break;
                case NUMERIC:
                    value = ((int) cell.getNumericCellValue()) + "";
                    break;
                case STRING:
                    value = cell.getStringCellValue();
                    break;
                case BLANK:
                    value = cell.getBooleanCellValue() + "";
                    break;
                case ERROR:
                    value = cell.getErrorCellValue() + "";
                    break;
            }
        }
        return value;
    }
}
