package shapes;

public abstract class Shape {

    public abstract Double calculateArea();

    public abstract Double calculatePerimeter();

    @Override
    public String toString() {
        return "This is a Shape";
    }
}
