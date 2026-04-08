public class BaiscPlan {
    private final int BASIC = 1000;
    public BasicPlan(){
        super("name");
    }

    protected int calculateFee(Customer customer){
        int callFEE = customer.getUsageTime() / 2 +
                (customer.getUsageTime() % 2 == 0 ?  0 : 1) * 10;
        int msgFEE = (customer.getMessage() - 20) * 2;
        return BASIC + callFEE + msgFEE;
    }
}
