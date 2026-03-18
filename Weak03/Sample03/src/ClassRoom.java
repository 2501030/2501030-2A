public class ClassRoom {
    private Teacher teacher;
    private Student student;

    public ClassRoom(Student student, Teacher teacher) {
        this.student = student;
        this.teacher = teacher;
    }

    public void stratClass(Book book) {
        if (teacher instanceof Teacher)
            ((Teacher) teacher).teach();
        if (student instanceof Student)
            ((Student)student).study(book);
    }
}
