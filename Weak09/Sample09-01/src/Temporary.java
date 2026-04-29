import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public abstract class Temporary extends Employee{
    private int dailyPay;
    private int workDay;


    public Temporary(String name, Date hireDate, String employeeID) {
        super(name, hireDate, employeeID);
    }

    protected void inputData(String type) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        inputPerformance(type, keyboard);
        inputStockOption(type, keyboard);

    }
    private void inputStockOption(String type, Scanner keyboard) {
        while (true) {
            System.out.printf("[%s] %s님의 스탑옵션 입력 : ", type, getName());
            stockOption = keyboard.nextInt();
            if (isValid2(stockOption))
                break;
            else
                error("스탁옵션 오류 (0 ~ 700000)");
        }
    }

    private void inputPerformance(String type, Scanner keyboard) throws IOException {
        while (true) {
            System.out.printf("[%s] %s님의 성과 수당 입력 : ", type, getName());
            performance = keyboard.nextInt();
            if (isValid2(perfomance))
                break;
            else
                error("성과 수당 오류 (0 ~ 700000)");
        }
    }


    @Override
    public int baseSalary() {
        return workDay * dailyPay;
    }


    @Override
    public String toString() {
        return String.format("%s %c급(%s) %c호봉 %2d %,6d원 %,9d원 %,7d원 %,7d원 %,7d원 %,8d원 %,9d원 %,7d원 %,9d원",
                super.toString(), 'X', "일용", 'X', workDay, dailyPay,
                baseSalary(), baseBonus(), managerBonus(), 0, 0,
                salary(), tax(), net());
    }
}
