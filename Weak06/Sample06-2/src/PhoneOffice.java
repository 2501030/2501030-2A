import java.io.IOException;

public class PhoneOffice {
    private Customer[] customers;

    public PhoneOffice(Customer[] customer) {
        this.customers = customer;
    }

    protected void inputData() throws IOException {
        for (int i = 0; i < customers.length; i++) {
            customers[i].inputUsageTime();
            customers[i].inputMessage();
        }
    }
    protected void displayData() throws IOException {
        line();
        System.out.print("Usage: ");
        line();
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers);
        }
    }

    private void line() {
        for (int i = 0; i <= 100; i++) {
            System.out.println();
        }
    }
}
