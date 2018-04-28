public class A {

    String description;

    public A() {
        System.out.println("Constructed A");
    }

    public A(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "A{" +
                "description='" + description + '\'' +
                '}';
    }
}
