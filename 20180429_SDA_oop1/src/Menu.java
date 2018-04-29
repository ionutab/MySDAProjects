import shapes.*;

import java.util.Scanner;

public class Menu {
    private final int EXIT_OPTION = 0;

    private Bucket bucket;

    public void displayMenu() {
        displayMenu(new int[0]);
    }

    private void displayMenu(int[] array) {
        int option = -1;
        displayOptions();
        option = readOption();
        int[] newArray = processOption(option, array);
        if (option != EXIT_OPTION) {
            displayMenu(newArray);
        }
    }

    private void displayOptions() {
        System.out.println();
        System.out.println("1. Create rectangle");
        System.out.println("2. Create square");
        System.out.println("3. Create circle");
        System.out.println("4. Create triangle");
        System.out.println("5. Test casts");
        System.out.println("6. Create bucket");
        System.out.println("7. Display bucket");
        System.out.println("8. Add shape");
        System.out.println("9. Reset bucket");
        System.out.println("0. Exit");
        System.out.println();
    }

    private int readOption() {
        System.out.print("Option: ");
        return new Scanner(System.in).nextInt();
    }

    private void createRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("read rectangle width: ");
        Double width = scanner.nextDouble();
        System.out.print("read rectangle height: ");
        Double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }

    private void createSquare() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("read square side: ");
        Double side = scanner.nextDouble();
        Square square = new Square(side);
        System.out.println(square);
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());
    }

    private void createCircle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("read circle radius: ");
        Double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println(circle);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
//        System.out.println(Circle.PI);
    }

    public void createTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("read triangle sides: ");
        Double l1 = scanner.nextDouble();
        Double l2 = scanner.nextDouble();
        Double l3 = scanner.nextDouble();

        Triangle triangle = new Triangle(l1, l2, l3);
        System.out.println(triangle);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }

    private void testCasts() {
        Scanner scanner = new Scanner(System.in);
        Double x = 5.00;
        Double y = 7.00;

        Rectangle rectangle = new Rectangle(x, y);
        System.out.println(rectangle);

        Rectangle square = new Square(x);
        System.out.println(square);

        // compile error
//        Square s1 = new Rectangle(x, y);

        // runtime error
//        Square s2 = (Square)rectangle;
//        System.out.println(s2);

        Rectangle r1 = (Rectangle) square;
        System.out.println(r1);

        Shape sh1 = new Circle(10.00);
        System.out.println(sh1);

        Shape[] shapes = new Shape[4];
        shapes[0] = new Triangle(6.00, 7.00, 8.00);
        shapes[1] = new Circle(8.00);
        shapes[2] = new Square(6.00);
        shapes[3] = new Rectangle(7.00, 8.00);

        System.out.println(" __________ ");
        System.out.println(" Printing Shapes ");
        for (int i = 0; i < 4; i++) {
            Shape shape = shapes[i];
            System.out.println(shape);
        }

//        Rectangle[] rectangles = new Rectangle[4];
//        rectangles[0] = new Triangle(6.00, 7.00, 8.00);

    }

    private void createBucket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input bucket size:");
        int bucketSize = scanner.nextInt();
        this.bucket = new Bucket(bucketSize);
    }

    private void displayBucket() {
        if(this.bucket != null){
            this.bucket.displayShapes();
        } else {
            System.out.println("Bucket not created");
        }
    }

    private void addShape() {
        Scanner scanner = new Scanner(System.in);
        String shapeName = scanner.nextLine();

        Shape newShape;

        switch (shapeName) {
            case "rectangle":
                Rectangle rectangle = new Rectangle(5.00, 8.00);
                bucket.addShape(rectangle);
                break;
            case "square":
                Square square = new Square( 8.00);
                bucket.addShape(square);
                break;
            case "triangle":
                Triangle triangle = new Triangle(5.00, 8.00, 12.00);
                bucket.addShape(triangle);
                break;
            case "circle":
                Circle circle = new Circle(12.00);
                bucket.addShape(circle);
                break;
            default:
                break;
        }
    }

    private void resetBucket() {
        this.createBucket();
    }

    private int[] processOption(int option, int[] array) {
        switch (option) {
            case 1:
                createRectangle();
                break;
            case 2:
                createSquare();
                break;
            case 3:
                createCircle();
                break;
            case 4:
                createTriangle();
                break;
            case 5:
                testCasts();
                break;
            case 6:
                createBucket();
                break;
            case 7:
                displayBucket();
                break;
            case 8:
                addShape();
                break;
            case 9:
                resetBucket();
                break;
            case 0:
            default:
        }
        return array;
    }
}