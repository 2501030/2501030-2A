public class OutputHandler {

    protected void display(Company company) {
        company.sortbyNet();
        Employee[] employees = company.getEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }
}
