package sda.school;

public class Teacher extends Person {

    String subject;

    public Teacher(String name, Integer age) {
        super(name, age);
        System.out.println("Constructed teacher");
    }

    public void showPerson(){
        System.out.println("Teacher");
        System.out.println(this.name);
        System.out.println(this.age);

//        System.out.println(this.cnp);

        System.out.println(this.address);
        System.out.println(this.subject);
    }


    public void showPerson2(){
        System.out.println("Teacher");
        super.showPerson2();
        System.out.println(this.subject);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                super.toString() +
                '}';
    }
}
