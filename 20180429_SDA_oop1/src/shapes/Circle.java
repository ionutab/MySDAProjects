package shapes;

public class Circle extends Shape {

    public static Double PI = 3.14;

    final Double radius;

    public Circle(Double radius) {
        this.radius = radius;
        System.out.println("Created Circle { radius" + radius + "}");
    }

    public Double getRadius() {
        return radius;
    }

//    public void setRadius(Double radius) {
//        this.radius = radius;
//    }

    public Double calculateArea(){
        return PI * getRadius() * getRadius();
    }

    public Double calculatePerimeter(){
        return 2 * PI * getRadius();
    }

    @Override
    public String toString(){
        return "Circle { radius " + radius + "}";
    }

}
