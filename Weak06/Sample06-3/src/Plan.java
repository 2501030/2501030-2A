public interface Plan {
    int NETWORK = 3200;
    int BASIC = 1000;
    double TAXRATE = 6.5;
    int UNIT = 2;
    int[] FEE = {10,5};

    String getName();
    int calculateFee(Customer customer);

    default boolean isOld(int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }
}
