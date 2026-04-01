public class Home extends Customer {
    public Home(String name, String waterNo) { // 생성자
        super(name, waterNo);
        type = new Type("가정용", 40, 5.0f);
    }
}
