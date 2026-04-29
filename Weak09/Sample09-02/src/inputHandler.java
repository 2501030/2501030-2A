import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class inputHandler {
    private Scanner keyboard;

    public inputHandler() {
        this.keyboard = new Scanner(System.in);
    }

    protected void inputData(Employee[] employees) throws IOException {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Temporary) {
                inputDailyPay(((Temporary) employees[i]));
                inputWorkday(((Temporary) employees[i]));
                System.out.println();
            } else if (employees[i] instanceof Executive) {
                inputPerformance(((Executive) employees[i]));
                inputStockOption(((Executive) employees[i]));
                System.out.println();
            }
        }
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
}
