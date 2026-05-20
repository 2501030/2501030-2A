import java.util.ArrayList;

public class Student extends Person{
    private String studentID;
    private String gender;
    private ArrayList<Subjcet> subjcet;

    public Student(String name, String studentID, String gender) {
        super(name,gender);
        this.studentID = studentID;
        this.gender = gender;
        this.subjcets = new ArrayList<>();
        subjcets.add(new Subjcet("국어",0));
        subjcets.add(new Subjcet("영어",0));
        subjcets.add(new Subjcet("수학",0));
        if (gender.equals("남")) {

        } else {

        }
    }

    public ArrayList<Subjcet> getSubjcets() {
        return subjcets;
    }

    public void setSubjcet(int index) {

    }
}
