public class DiscountPlan extends Plan {
    private final int BASIC = 1000;
    public DiscountPlan() {
        super("할인 요금제");
    }

    protected int calculateFee(Customer customer){
        int callFEE = customer.getUsageTime() / 2 +
                (customer.getUsageTime() % 2 == 0 ?  0 : 1) * 5;
        int msgFEE = 0;
        if  (customer.getBirthDay().getAge() >= 80)
            msgFEE = 0;
        else
            msgFEE = (customer.getMessage() - 40) * 2;
        return NETWORK + BASIC + callFEE + msgFEE;
    }
}
