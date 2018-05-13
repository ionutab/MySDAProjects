package emp;

public abstract class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayName(){
        System.out.println("Name: " + name);
    }
}
