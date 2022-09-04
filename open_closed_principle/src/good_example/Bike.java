package good_example;

public class Bike extends Vehicle {

    public Bike(double value) {
        super(value);
    }

    @Override
    public double calculateValue() {
        return this.getValue() * 0.5;
    }
}
