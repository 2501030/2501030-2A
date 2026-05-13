import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler implements Constants{

    private Throwable e;

    protected ArrayList<Customer> readData(File file) {
        ArrayList<Customer> customers = new ArrayList<>();
        try {
            Scanner filescanner = new Scanner(file, StandardCharsets.UTF_8);
            String line;
            while (filescanner.hasNextLine()) {
                line = filescanner.nextLine();
                line = line.trim().replaceAll(",", "");
                Scanner lineScanner = new Scanner(line);
                String customerID = lineScanner.next();
                Customer customer;
                if (customerID.charAt(0) == '9') {
                    customer = new Special(lineScanner.next(), customerID, lineScanner.nextInt());
                } else {
                    customer = new Normal(lineScanner.next(), customerID, lineScanner.nextInt());
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
