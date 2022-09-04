package good_example;

public abstract class Vehicle {
    private double value;

    public Vehicle(double value) {
        this.value = value;
    }

    public double getValue() {return value;}

    public abstract double calculateValue();
}
