package good_example;

public class Car extends Vehicle {

    public Car(double value) {
        super(value);
    }

    @Override
    public double calculateValue() {
        return this.getValue() * 0.8;
    }
}
