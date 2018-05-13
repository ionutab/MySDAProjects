package emp;

public class Manager extends Employee implements ISalariedEmp {

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
        department.addEmp(employee);
   }

}
