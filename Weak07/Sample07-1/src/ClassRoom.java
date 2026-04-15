import java.io.IOException;

public class ClassRoom {
    private static Student[] students;

    public ClassRoom(Student[] students) {

    }

    public static void dispaly() {
    }

    protected static void inputData() throws IOException {
        for (int i = 0; i < students.length; i++) {
            students[i].inputData();
            System.out.println();
        }
    }

    private void display() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
    }
}
