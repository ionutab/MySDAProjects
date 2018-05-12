package shapes;

public class Triangle implements Shape {

    private Double l1;
    private Double l2;
    private Double l3;

    public Triangle(Double l1, Double l2, Double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public Double calculateArea() {
        Double perimeter = calculatePerimeter();
        return Math.sqrt((perimeter - l1) * (perimeter - l2) * (perimeter - l3));
    }

    @Override
    public Double calculatePerimeter() {
        return l1 + l2 + l3;
    }
}
