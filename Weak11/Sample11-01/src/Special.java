public class Special extends Customer{
    public Special(String name, String customerID, int powerUsage) {
        super(name, customerID, powerUsage);
    }

    @Override
    protected int fee() {
        int temp = getPowerUsage() - 100;
        if (temp < 0)
            temp = 0;
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

    @Override
    public String toString() {
        return String.format("%s %s", super.toString(), "지원가구");
    }
}
