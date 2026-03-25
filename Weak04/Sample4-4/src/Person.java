public class Person {
    private String name;
    private String birthday;

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return String.format("%3s%s", name, birthday);
    }
}
