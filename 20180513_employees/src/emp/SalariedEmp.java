package emp;

public class SalariedEmp extends Employee implements ISalariedEmp {

    double salary;

    public SalariedEmp(String name) {
        super(name);
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
