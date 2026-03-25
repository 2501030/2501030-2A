import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Employee {
    private String name;
    private String employeeID;
    private Date birthday;
    private Department department;
    private Grade grade;
    private int extraPay;

    public Employee(String name, String employeeID, Date birthday, Department department, Grade grade) {
        this.name = name;
        this.employeeID = employeeID;
        this.birthday = birthday;
        this.department = department;
        this.grade = grade;
    }

    protected void inputExtraPay() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님의 수당 입력 : ", name);
            extraPay = keyboard.nextInt();
            if (extraPay >= 0 && extraPay <= 1000000) {
                break;
            } else {
                System.err.print("ERRROR : 수당 오류");
                System.in.read();
            }
        }
    }

    private int gross() {
        return grade.getBaseSalary();
    }

    private int tax() {
        return tax();
    }

    private int Payment() {
        return Payment();
    }

    @Override
    public String toString() {
        return String.format("%3s%s %4s %3d %c %,10d원 %,8d원 %,10d원 %,8d원 &,10d원",
                name, birthday, employeeID, department.getName(), grade.toString(), extraPay, gross(), tax(), Payment());
    }
}
