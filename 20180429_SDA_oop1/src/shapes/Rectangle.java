package shapes;

public class Rectangle implements Shape {

    private final Double width;
    private final Double height;

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
        System.out.println("Created Rectangle { width:" + getWidth() + " height:" + getHeight() + " }");
    }

    @Override
    public String toString(){
        return "Rectangle { width:" + getWidth() + " height:" + getHeight() + " }";
    }

    public Double calculateArea(){
        return getWidth() * getHeight();
    }

    public Double calculatePerimeter(){
        return 2 * getWidth() + 2 * getHeight();
    }

    public Double getWidth() {
        return width;
    }

//    public void setWidth(Double width) {
//        this.width = width;
//    }

    public Double getHeight() {
        return height;
    }

//    public void setHeight(Double height) {
//        this.height = height;
//    }
}
