package emp;

public class Department {

    public Manager manager;
    public String name;
    Employee[] employees = new Employee[10];
    int currentNoEmp = 1;

    public Department(Manager manager,String name) {
        this.manager = manager;
        this.name=name;
        employees[0]=manager;
    }

    public void addEmp(Employee employee){
        employees[currentNoEmp]=employee;
        currentNoEmp++;
    }

    public void showEmp(){
        for(int i = 0; i < currentNoEmp; i++){
            Employee employee = employees[i];
            employee.sayName();
        }
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getCurrentNoEmp() {
        return currentNoEmp;
    }

    public void setCurrentNoEmp(int currentNoEmp) {
        this.currentNoEmp = currentNoEmp;
    }
}
