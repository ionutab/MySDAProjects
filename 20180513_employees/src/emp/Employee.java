package emp;

import java.util.Date;

public class Employee extends Person {

    Date hireDate;

    public Employee(String name) {
        super(name);
    }

    public void sayName(){
        System.out.println("Employee name: " + name);
    }

}
