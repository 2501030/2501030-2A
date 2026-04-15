import java.io.IOException;
import java.util.Scanner;

public class Setting implements MyProject {
    public static Setting setting;

    public Setting() {
    }

    protected static int setting() throws IOException {
        int type;
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.print(" 1 = 고등학교, 2 = 대학교 선택 : ");
            type = keyboard.nextInt();
            if (type == 1 || type == 2) {
                break;
            } else
                MyProject.error("1 or 2");
        }
        return type;
    }

    protected static Student[] prepare(int type, Person[] persons) throws IOException {
        Student[] students;
        if (type == 1) {
            students = new HighSchool[persons.length];
            for (int i = 0; i < persons.length; i++) {
                students[i] = new HighSchool(persons[i].getStudentID(), persons[i].getName()) {
                    @Override
                    public String partList() {
                        return "";
                    }
                };
            }
        } else {
            students = new University[persons.length];
        }
        return students;
    }
}
