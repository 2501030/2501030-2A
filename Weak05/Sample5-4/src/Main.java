//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Customer[] customs = new Customer[]{
                new Home("홍길동", "1365"),
                new Government("이대한", "5678"),
                new Factory("이수도", "3333"),
                new Large("경복대","5649"),
                new Army("김천지", "4444"),
                new Home("정밀도", "5234"),
                new Business("정확한", "5567"),
                new Business("이수한", "3473"),
                new Army("김천도", "4564"),
                new Factory("정확도", "5895"),
                new Home("김이천", "5523"),
                new School("이대한","2645")
        };

        Wateroffice water = new Wateroffice(customs);
        water.inputData();
        water.display();
    }
}