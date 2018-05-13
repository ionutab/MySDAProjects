import emp.Department;
import emp.Employee;
import emp.Manager;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager("Marcel");
        Department department = new Department(manager,"HR");
        Employee emp1 = new Employee("Emp1");
        Employee emp2 = new Employee("Emp2");
        manager.hire(department,emp1);
        manager.hire(department,emp2);
        department.showEmp();

    }
}
