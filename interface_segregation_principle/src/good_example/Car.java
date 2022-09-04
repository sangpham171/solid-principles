package good_example;

public class Car implements FuelVehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public void refuel() {
        System.out.println("Car is refueling");
    }
}
