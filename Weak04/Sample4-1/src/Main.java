//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("홍길동", "1234", new Date(2003,3,25),'1','1'),
                new Employee("이나라", "1345", new Date(2001,12,25),'3','2'),
                new Employee("나정산", "1362", new Date(2002,8,30),'4','3'),
                new Employee("김대한", "1234", new Date(2003,3,17),'4','4'),
                new Employee("김대한", "1234", new Date(2003,3,17),'5','1'),
        };
    }
    company company = new Company(employees);
    company.inputData();
    company.display();
    }