public class DiscountPlan implements Plan {
    @Override
    public String getName() {
        return "";
    }

    final int BASIC = 1000;
    final int NETWORK = 3200;

    @Override
    public int calculateFee(Customer customer){
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
