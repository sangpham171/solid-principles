import good_example.Bike;
import good_example.Car;
import good_example.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(10000);
        Vehicle bike = new Bike(1000);
        System.out.println(car.calculateValue());
        System.out.println(bike.calculateValue());
    }
}