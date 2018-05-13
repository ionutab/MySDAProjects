import emp.*;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager("Marcel");
        Department department = new Department(manager,"HR");
        Employee emp1 = new HourlyEmp("Emp1",5,20);
        Employee emp2 = new SalariedEmp("Emp2",5000);

        manager.hire(department,emp1);
        manager.hire(department,emp2);
        SalariedAcc salariedAcc = new SalariedAcc("Contabilu'",3000);
        manager.hire(department,salariedAcc);
        department.showEmp();
//        salariedAcc.pay(department.getEmployees(),department.getCurrentNoEmp());
        salariedAcc.pay(department.getEmployees(),department.getCurrentNoEmp());
    }
}
