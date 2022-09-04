import good_example.Car;
import good_example.DieselEngine;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new DieselEngine());
        car.start();
    }
}