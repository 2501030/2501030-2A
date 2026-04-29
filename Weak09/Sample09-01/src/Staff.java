import java.util.Date;

public class Staff extends Regular {
    int grade;
    int step;

    public Staff(String name, Date hireDate, String employeeID, int grade, int step) {
        super(name, hireDate, employeeID, grade, step);
    }

    @Override
    public String toString() {
        return String.format("%s %,7d원 %,7d원 %,7d원 %,8d원 %,9d원 %,7d원 %,9d원",
                super.toString(), base);
    }
}
