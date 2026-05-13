import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler implements Constants{

    private Throwable e;

    protected ArrayList<Customer> readData(File file) {
        ArrayList<Customer> customers = new ArrayList<>();
        try {
            FileInputStream inputStream = new FileInputStream(file);
            InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(streamReader);
            String line;
            while (line = reader.readLine() != null) {
                line = line.trim().replaceAll(",", "");
                String[] datas = line.split(" ");
                String customerID = datas[0];;
                Customer customer;
                if (customerID.charAt(0) == '9')
                    customer = new Special(datas[1], customerID, Integer.parseInt(datas[2]));
                else {
                    customer = new Normal(datas[1], customerID, Integer.parseInt(datas[2]));
                    customers.add(customer);
                    lineScanner.close();
                }
                filescanner.close();

                if (customer.isEmpty()) {
                    System.err.println("데이터가 없습니다");
                    System.exit(-1);
                } else (FileNotFoundException) {
                            System.err.printf(e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
