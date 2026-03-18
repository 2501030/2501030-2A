public class Teacher {
    private String name;
    private String subject;

    public Teacher(String subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    public void teach() {
        System.out.printf("%s 선생님(%s) : 자 ,수업 시작하자!\n ", name, subject);
    }
}
