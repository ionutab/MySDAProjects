public class F extends A {

    String description;

    public String getDescription() {
        return super.description;
    }

    public void setDescription(String description) {
        super.description = description;
    }

    @Override
    public String toString() {
        return "F{" +
                "description='" + description + '\'' +
                '}';
    }

    public String showSuperClass(){
        return super.toString();
    }
}
