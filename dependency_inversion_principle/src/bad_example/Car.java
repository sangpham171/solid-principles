package bad_example;

public class Car {

    private Engine engine;

    public Car(Engine e) {
        this.engine = e;
    }

    public void start() {
        this.engine.start();
    }
}
