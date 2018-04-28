public class B extends A {

    String description;

    public B(String description) {
        this.description = description;
        System.out.println("Constructed B");
    }

    @Override
    public String toString() {
        return "B{" +
                "description='" + description + '\'' +
                '}';
    }
}
