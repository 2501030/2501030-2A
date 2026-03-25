import java.io.IOException;

public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    protected void inputData() throws IOException {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    private int extraPayTotal() {
        int temp = 0;
        for (int i = 0; i < employees.length; i++)
            temp += employees[i].extraPay;
        return temp;
    }

    public int salaryTotal() {
        int temp = 0;
        for (int i = 0; i < employees.length; i++)
            temp += employees[i].salary();
        return temp;
    }

    public int paymentTotal() {
        int temp = 0;
        for (int i = 0; i < employees.length; i++)
            temp += employees[i].payment();
        return temp;
    }

    private void sortByPayment() {
        Employee temp;
        for (int i = 0; i < employees.length - 1; ++i) {
            for (int j = i + 1; j < employees.length; ++j) {
                if (employees[i].payment() < employees[j].payment()) {
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
    }

    protected void display() {
        sortByPayment();
        line();
        System.out.println(" 이름(생일)  사번  부서  호봉  기본급  수당  금여  세금  지급액");
        line();
        for (int i = 0; i < employees.length; i++) {
            if (i != 0 && i % 5 == 0)
                System.out.println();
            System.out.println(employees[i]);
        }
        line();
        System.out.printf(" %,46d %,d %,33d\n", salaryTotal(), extraPayTotal(), paymentTotal());
        line();
    }

    private  void line() {
        for (int i = 0; i < 94; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
