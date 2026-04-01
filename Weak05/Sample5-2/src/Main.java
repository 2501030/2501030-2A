//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Type[] types = new Type[]{
                new Type("가정용",25,50),
                new Type("영업용",55,35),
                new Type("공장용",78,25),
                new Type("관공서",35,15),
                new Type("군기관",20,0)
        };
    }

    private Type[] type;
    Customer[] customers = new Customer[]{
            new Customer("홍길동", "1365", type[1]),
            new Customer("이대한", "5678", type[4]),
            new Customer("이수도", "3333", type[3]),
            new Customer("김천지", "4444", type[5]),
            new Customer("정밀도", "5234", type[1]),
            new Customer("정확한", "5567", type[2]),
            new Customer("이수한", "3473", type[2]),
            new Customer("김천도", "4564", type[5]),
            new Customer("정확도", "5895", type[3]),
            new Customer("김이천", "5523", type[1])
    };

    Wateroffice office = new Wateroffice(customers);
}