package emp;

public class SalariedEmp extends Employee implements ISalariedEmp {

    double salary;

    public SalariedEmp(String name) {
        super(name);
    }

    public SalariedEmp(String name,double salary){
        super(name);
        this.salary=salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPayAmount() {
//        System.out.println("SE Pay amount: " + getSalary());
        return getSalary();
    }

}
