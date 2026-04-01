public class Wateroffice {
    private Customer[] customers;

    public Wateroffice(Customer[] customers) {
        this.customers = customers;
    }

    protected void inputData() {
        for (int i = 0; i < customers.length; i++)
            System.out.println(customers[i]);
    }

    protected int totalFee() {
        int total = 0;
        for (int i = 0; i < customers.length; i++)
            total += customers[i].fee();
        return total;
    }

    protected void display() {
        line();
        System.out.println("수도번호  이름  구분  사용량  사용금액  세금  납부액  비고");
        line();
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }
    }

    private void line() {
        for (int i = 0; i < 80; i++)
            System.out.print("*");
        System.out.println();
    }
}
