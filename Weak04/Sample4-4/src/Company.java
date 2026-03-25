import java.io.IOException;

public class Company {
    private Employee[] employees;
    public Company(Employee[] employees) {
        this.employees = employees;
    }
    protected void dataInput() throws IOException {
        for (int i = 0; i < employees.length; i++)
            employees[i].inputData();
    }
    private int extraPayTotal() {
        int temp = 0;
        for (int i = 0; i < employees.length; i++)
            temp += employees[i].extraPay;
        return temp;
    }

    public void sortByPayment() {
        Collections.sort(employees, new netComparator().reversed());
    }

    private class netComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.payment() - o2.payment();
        }
    }


}
