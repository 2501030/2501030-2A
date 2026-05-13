import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FileHandler implements Constants{

    private Throwable e;

    protected ArrayList<Customer> readData(File file) throws IOException {
        ArrayList<Customer> customers = new ArrayList<>();
        try {
            List<String> lines = FileUtils.readLines(file, StandardCharsets.UTF_8);
            for (int i=0; i<lines.size(); i++) {
                String line  = lines.get(i).trim().replaceAll(",", "");
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                StringTokenizer tokenizer = new StringTokenizer(line, ",");

                String customerID =  tokenizer.nextToken();
                Customer customer;
                if(customerID.charAt(0) == '9'){
                    customer = new Special();
                    customer.setName(tokenizer.nextToken());
                    customer.setCustomerID(customerID);
                    customer.setPowerUsage(Integer.parseInt(tokenizer.nextToken()));
                } else {
                    customer = new Normal();
                    customer.setName(tokenizer.nextToken());
                    customer.setCustomerID(customerID);
                    customer.setPowerUsage(Integer.parseInt(tokenizer.nextToken()));
                    customers.add(customer);
                }
                randomAccessFile.close();
            }
            StringTokenizer tokenizer = new StringTokenizer(lines.get(0), "");
            while (line = reader.readLines() != null) {
                line = line.trim().replaceAll(",", "");
                String[] datas = line.split(" ");
                String customerID = datas[0];;
                Customer customer;
                if (customerID.charAt(0) == '9')
                    customer = new Special(datas[1], customerID, Integer.parseInt(tokenizer.nextToken()));
                else {
                    customer = new Normal(datas[1], customerID, Integer.parseInt(tokenizer.nextToken()));
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
