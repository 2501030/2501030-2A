import java.util.Date;

public abstract class Employee extends Person implements Myproject {
    private String employeeID;

    public Employee(String name, Date hireDate, String employeeID) {
        super(name, hireDate);
        this.employeeID = employeeID;
    }

    protected int tax() {
        int money = salary();
        int tax;
        if (money < TAX1)
            tax = (int) (money * (TAXRATE1 / 100));
        else if (money < TAX2)
            tax = (int) (money * (TAXRATE2 / 100));
        else if (money < TAX3)
            tax = (int) (money * (TAXRATE3 / 100));
        else
            tax = (int) (money * (TAXRATE4 / 100));
        return tax;
    } // 세금

    @Override
    public int managerBonus() {
        return 0;
    }

    @Override
    public int baseBonus() {
        return 0;
    }

    @Override
    public int salary() {
        return 0;
    }

    protected int net() {
        return salary() - tax();
    } // 지급액


    public abstract int bonus();

    @Override
    public String toString() {
        return String.format("%4s %s", employeeID, super.toString());
    }
}
