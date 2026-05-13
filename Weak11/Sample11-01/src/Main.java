import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = ".\\data\\";
        String dataFile = "customer.dat";
        String outputFile = "customer.rpt";
        ArrayList<Customer> customers;

        File file = new File(path + dataFile);
        if (file.exists()) {
            FileHandler handler = new FileHandler();
            customers = handler.readData(file);

            PowerOffice office = new PowerOffice(customers);
            office.sortByCharge();

            OutputHandler outputHandler = new OutputHandler();
            outputHandler.report(path + outputFile, customers);
            try {
                Runtime.getRuntime().exec("notepad.exe" + path + outputFile);
            } catch (IOException e) {
                System.err.printf(e.getMessage());
            }
        } else {
            System.out.printf("%s 파일이 존재하지 않아요\n", path + dataFile);
        }
    }
}