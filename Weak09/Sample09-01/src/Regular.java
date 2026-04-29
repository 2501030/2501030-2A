import java.util.Date;

public abstract class Regular extends Employee {
    private int grade;
    private int step;

    public Regular(String name, Date hireDate, String employeeID) {
        super(name, hireDate, employeeID);
    }



    @Override
    public int baseSalary() {
        return base[grade];
    }

    @Override
    public int baseBonus() {
        return step * STEPBONUS;
    }


    private String gradeName() {
        return gradeName[grade];
    }

    @Override
    public String toString() {
        return String.format("%s %c급(%s) %d호봉 %2d %,6d원 %,9d원",
                super.toString(), grade, gradeName(), step,
                0, 0, baseSalary());
    }
}
