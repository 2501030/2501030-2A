public class ClassRoom {
    private Student student;
    private Teacher teacher;

    public ClassRoom(Student student, Teacher teacher) {
        this.teacher = teacher;
        this.student = student;
    }

    public void stratClass(Book book) {
        teacher.teach();
        student.study(book);
    }
}
