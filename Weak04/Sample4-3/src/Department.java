public class Department {
    private char departNo;
    private String name;

    public Department(char departNo, String name) {
        this.departNo = departNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%3s", name);
    }

    public Object getName() {
        return null;
    }
}
