public class ElectricCar extends Car {

    public ElectricCar() {
        Super("전기 자동차");
    }

    public void charge() {
        System.out.println(model + "가 충전 합니다.");
    }
}
