public class School extends Customer {
    public School(String name, String waterNo) {
        super(name, waterNo);
        type = new Type("공장용", 78, 2.5f);
    }
}



