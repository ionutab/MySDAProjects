package emp;

import java.util.Date;

public class Manager extends SalariedEmp {

    public Manager(String name) {
        super(name);
    }

    public double getSalary(){
        return 5000;
    }

   public void sayName(){
       System.out.println("Managers name: " + name);
   }

   public void hire(Department department,Employee employee){
        employee.setHireDate(new Date());
        department.addEmp(employee);
   }

   public double getPayAmount(){
        return getSalary();
   }

}
