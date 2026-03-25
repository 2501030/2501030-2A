import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Employee {
    private String name;
    private String employeeID;
    private Date birthday;
    private char department;
    private char grade;
    int extraPay;


    public Employee(String name, String employeeID, Date birthday, char department, char grade) {
        this.name = name;
        this.birthday = birthday;
        this.department = department;
        this.grade = grade;
        this.employeeID = employeeID;
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

    private String department() {
        String dept = "";
        switch (department) {
            case '1':
                dept = "인사팀";
                break;
            case '2':
                dept = "재무팀";
                break;
            case '3':
                dept = "영업부";
                break;
            case '4':
                dept = "개발팀";
                break;
            case '5':
                dept = "생산팀";
        }
        return dept;
    }

    int salary() {
        int result = 0;
        return result;
    }

    private int gross() {
        return salary() + extraPay;
    }

    private int tax() {
        int tax = 0;

        if (gross() < 1700000) {
            tax = (int) (gross() * (5.0f / 100));
        } else if (gross() < 2300000) {
            tax = (int) (gross() * (8.0f / 100));
        } else {
            tax = (int) (gross() * (10.0f / 100));
        }
        return tax;
    }

    protected int payment() {
        return gross() - tax();
    }

    @Override
    public String toString() {
        return String.format("%3s%s %4s %3s %c %,10d원 %,8d원 %,10d원 %,8d원 %,10d원",
                name, employeeID, department, grade, department(), extraPay, salary(),
                gross(), tax(), payment());
    }
}

