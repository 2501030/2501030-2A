import java.io.IOException;
import java.util.Scanner;

public class Customer {
    private String name;
    private String waterNo;
    private Type type; // Has-a 관계
    protected float usage;
    private final int BASIC;

    public Customer(String name, String waterNo, Type type) {
        this.name = name;
        this.waterNo = waterNo;
        this.type = type;
        this.usage = 0.0f;
        this.BASIC = 1200;
    }
    protected void inputData() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("[%s] %s님의 수도 사용량 입력 : ",
                    type.getTypeName(), name);
            usage = keyboard.nextFloat();
            if (usage >= 0.0f && usage <= 999.9f)
                break;
            else {
                System.err.print("Error : 수도 사용량은 0 ~ 999.9까지 임");
                System.in.read();
            }
        }
    }
    protected int fee() {
        int use = (int) (usage + 0.5f);
        int fee = BASIC + (use * type.getUnitPrice());
        return fee;
    }
    protected int tax() {
        int tax = (int) (fee() * (type.getTaxRate() / 100));
        tax = (tax / 10) * 10;
        return tax;
    }
    @Override
    public String toString() {
        return String.format("%6s %3s %3s %,8.2f\u33A5 %,7d원 %,6d원 %,7d원 %s",
                waterNo, name, type.getTypeName(), usage, fee(), tax(),
                (type.getTypeName().equals("군기관") ? "일괄징수" : ""));
    }
}
