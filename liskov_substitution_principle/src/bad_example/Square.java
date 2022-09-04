package bad_example;

public class Square extends Rectangle {
    public void setHeight(double h) {
        super.setHeight(h);
        super.setWidth(h);
    }

    public void setWidth(double w) {
        super.setHeight(w);
        super.setWidth(w);
    }
}
