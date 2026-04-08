public class BasicPlan implements Plan {

    @Override
    public String getName(){
        return "기본 요금제";
    }

    @Override
    public int calculateFee(Customer customer){
       int callFEE = customer.getUsageTime() / 2 +
               (customer.getUsageTime() % 2 == 0 ?  0 : 1) * 10;
       int msgFEE = (customer.getMessage() - 20) * 2;
       return BASIC + callFEE + msgFEE;
   }



}
