public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    protected void inputData() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Temporary) {
                ((Temporary) (employees[i]).inputData("일용직");
                System.out.println();
            } else if (employees[i] instanceof Executive) {

            }
        }
    }

    private void sortByNet() {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if (employees[j].net() < employees[j + 1].net()) {
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
    }

    protected void display() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }
}
