public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        System.out.println("Car is Driving....");
    }

    public void stop() {
        engine.stop();
        System.out.println("Car has Stopping....");
    }
}
