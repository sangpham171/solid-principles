import good_example.Bike;
import good_example.Car;
import good_example.FuelVehicle;
import good_example.Vehicle;

public class Main {
    public static void main(String[] args) {
        FuelVehicle car = new Car();
        car.drive();
        car.stop();
        car.refuel();

        Vehicle bike = new Bike();
        bike.drive();
        bike.stop();
    }
}