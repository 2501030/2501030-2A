public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("홍길동", "1234", new Date(2003, 3, 25), '1', '1'),
                new Employee("이나라", "1345", new Date(2001, 12, 25), '3', '2'),
                new Employee("나정산", "1362", new Date(2002, 8, 30), '4', '3'),
                new Employee("김대한", "1234", new Date(2003, 3, 17), '4', '4'),
                new Employee("김대한", "1234", new Date(2003, 3, 17), '5', '1'),
        };
    }
}