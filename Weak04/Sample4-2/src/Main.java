//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Department[] departments = new Department[]{
                new Department('0',""),
                new Department('1',"인사팀"),
                new Department('2',"인사팀"),
                new Department('3',"인사팀"),
                new Department('4',"인사팀"),
                new Department('5',"인사팀"),
        };

        Grade[] grades = new Grade[]{
                new Grade('0',0),
                new Grade('1',1650000),
                new Grade('1',1680000),
                new Grade('1',1700000),
                new Grade('1',1720000),
                new Grade('1',1750000)
        };

        Employee[] employees = new Employee[]{
                new Employee("홍길동", "1234", new Date() departments[1], grades[1]),
                new Employee("이나라", "1345", departments[3], grades[2]),
                new Employee("나정산", "1362", departments[5], grades[5]),
                new Employee("김대한", "1234", departments[2], grades[3]),
                new Employee("김대한", "1234", new Date(2003,3,17),'5','1'),
        };

        Company company = new Company(employees);
        company.inputData();
        company.display();
    }
}