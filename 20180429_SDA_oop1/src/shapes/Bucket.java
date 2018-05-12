package shapes;

/*
 * Some kind of basic bucket for abstract objects
 * */
public class Bucket {

    //numarul curent de obiecte
    private int nrOfShapes = 0;

    //array-ul de obiecte
    private Shape[] shapes;

    public Bucket(int bucketSize) {
        shapes = new Shape[bucketSize];
    }

    public void displayShapes() {

        System.out.println("buclet has " + nrOfShapes + " shapes");

        for (int i = 0; i < nrOfShapes; i++) {

            Shape shape = shapes[i];
            if (shape != null) {
                System.out.println(shape);
                System.out.println(shape.calculateArea());
                System.out.println(shape.calculatePerimeter());
            }

        }
    }

    public void addShape(Shape shape) {

        if (nrOfShapes >= shapes.length) {
            System.out.println("Bucket is full. Please empty.");
            return;
        }

        shapes[nrOfShapes] = shape;
        nrOfShapes++;
    }

    public void resetBucket(int bucketSize) {
        shapes = new Shape[bucketSize];
        nrOfShapes = 0;
    }
}
