public class Plan {
    private String name;
    protected final int NETWORK = 3200;

    public Plan(String name) {
        this.name = name;
    }

    public Plan() {
    }

    public String getName() {
        return name;
    }
}
