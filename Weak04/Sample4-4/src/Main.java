import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Department[] departments = new Department[]{
                new Department('0', ""),
                new Department('1', "인사팀"),
                new Department('2', "인사팀"),
                new Department('3', "인사팀"),
                new Department('4', "인사팀"),
                new Department('5', "인사팀"),
        };

        Grade[] grades = new Grade[]{
                new Grade('0', 0),
                new Grade('1', 1650000),
                new Grade('1', 1680000),
                new Grade('1', 1700000),
                new Grade('1', 1720000),
                new Grade('1', 1750000)
        };

        ArrayList<Employee> employees = new ArrayList<>();
        Employee[] employees = new Employee[]{
                employees.add(new Employee("홍길동", "1234", new Date(2003, 3, 25),
                        departments[1], grades[1]));
        employees.add(new Employee("이나라", "1345", departments[3], grades[2]));
        employees.add(new Employee("나정산", "1362", departments[5], grades[5]));
        employees.add(new Employee("김대한", "1234", departments[2], grades[3]));
        employees.add(new Employee("김대한", "1234", new Date(2003, 3, 17), '5', '1'));
    };
        Company company = new Company(employees);
        company.inputData();
        company.display();
    }
}