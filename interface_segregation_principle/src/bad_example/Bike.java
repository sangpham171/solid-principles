package bad_example;

public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Bike is driving");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }

    @Override
    public void refuel() {
        throw new UnsupportedOperationException("Bike cannot refuel");
    }

}
