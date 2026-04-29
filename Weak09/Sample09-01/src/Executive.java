import java.util.Date;

public class Executive extends Regular{
    private int performance;
    private int stcokOption;

    public Executive(String name, Date hireDate, String employeeID) {
        super(name, hireDate, employeeID);
    }

    @Override
    public int bonus() {
        return 0;
    }

    @Override
    public int salary() {
        return baseSalary() + performance + stockOption;
    }

    @Override
    public String toString() {
        return String.format("%s %,7d원 %,7d원 %,7d원 %,8d원 %,9d원 %,7d원 %,9d원",
                super.toString(), base);
    }
}
