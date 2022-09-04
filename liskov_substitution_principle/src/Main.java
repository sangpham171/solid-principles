import good_example.Rectangle;
import good_example.Shape;
import good_example.Square;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(2);
        System.out.println(square.area());

        Shape rectangle = new Rectangle(2, 3);
        System.out.println(rectangle.area());
    }
}