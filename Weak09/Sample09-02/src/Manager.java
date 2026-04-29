import java.util.Date;

public abstract class Manager extends Regular{

    public Manager(String name, Date hireDate, String employeeID) {
        super(name, hireDate, employeeID);
    }

    @Override
    public int baseBonus() {
        return (int) (baseSalary() * (10.0 / 100));
    }

    @Override
    public int managerBonus() {
        return (int) (baseSalary() * (10.0 / 100));
    }

    @Override
    public int salary() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s %,7d원 %,7d원 %,7d원 %,8d원 %,9d원 %,7d원 %,9d원",
                super.toString(), base);
    }
}
