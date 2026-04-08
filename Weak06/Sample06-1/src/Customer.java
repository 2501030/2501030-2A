import java.io.IOException;
import java.util.Scanner;

import static sun.awt.shell.Win32ShellFolder2.NETWORK;

public class Customer extends Person {
    private String phoneNo;
    private int usageTime;
    private int message;
    private Plan plan;

    public Customer(String name, Date birthDay, String phoneNo, Plan plan) {
        super(name, birthDay);
        this.phoneNo = phoneNo;
        this.usageTime = 0;
        this.message = 0;
        if (this.getBirthDay().getAge() >= 80)
            this.plan = new DiscountPlan();
        else
          this.plan = plan;
    }

    public int getUsageTime() {
        return usageTime;
    }

    public int getMessage() {
        return message;
    }

    protected void inputUsageTime() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님 통화 시간 입력 : ", super.getName());
            usageTime = keyboard.nextInt();
            if (usageTime >= 0) {
                break;
            } else {
                System.err.print("ERROR : 통화 시간 오류");
                System.in.read();
            }
        }
    }

    protected void inputMessage() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님 문자 메시지 건수 입력 : ", super.getName());
            message = keyboard.nextInt();
            if (message >= 0) {
                break;
            } else {
                System.err.print("ERROR : 통화 시간 오류");
                System.in.read();
            }
        }
    }

    private int fee(){
        int fee = 0;
        if (plan instanceof BasicPlan)
            fee =  ((BasicPlan) plan).calculateFee(this);
        else if (plan instanceof DiscountPlan)
            fee = ((DiscountPlan) plan).calculateFee(this);
        return fee;
    }

    protected int tax(Customer customer){
        int total = NETWORK + calculateFee(customer);
        int tax = 0;
        if (this.getBirthDay().getAge() < 19)
            tax = ((BasicPlan) plan).tax(this);
        else
            tax = (int) (total * (6.5 / 100));
        return tax;
    }

     private int tax() {
        return 0;
    }

    private int charge(){
        return fee() + tax();
    }

    @Override
    public String toString() {
        return String.format("%s %13s %,7d초 %,7d건 %6s %,10d원 %,6d원 %,10d원",
                super.toString(), phoneNo, usageTime, message, plan.getName(),
                fee(), tax(), charge());
    }
}
