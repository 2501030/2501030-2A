public class Customer extends Person implements Constants{
    private String customerID;
    private int powerUsage;

    public Customer(String name, String customerID) {
        super(name);
        this.customerID = customerID;
        this.powerUsage = 0;
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    protected int fee() {
        int temp = powerUsage;
        float fee = basic;
        for (int i = 0; i < table.length; i++) {
            int usage = Math.min(temp, limits[i]);
            fee += usage * table[i];
            temp -= usage;
            if (temp <= 0)
                break;
        }
        return (int) fee;
    }

    private int tax() {
        return (int) (fee() * (7.0f / 100));
    }

    protected int charge() {
        return fee() + tax();
    }

    @Override
    public String toString() {
        return String.format("%6s %3s %,4d Kw %,8d원 %,7d원 %,8d원", customerID, getName(), powerUsage,
                fee(), tax(), charge());
    }

    public boolean isEmpty() {
        return isEmpty();
    }
}
