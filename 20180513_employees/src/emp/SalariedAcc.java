package emp;

public class SalariedAcc extends SalariedEmp implements IAccountingEmp{

    public SalariedAcc(String name){
        super(name);
    }

    public SalariedAcc(String name, double salary){
        super(name);
        this.salary=salary;
    }

    public void pay(IPayable iPayable){
        System.out.println("Payed: " + iPayable.getPayAmount());
    }

    public void pay(IHourlyEmp iHourlyEmp){
        System.out.println("Total h * r: " + iHourlyEmp.getHours()*iHourlyEmp.getRate());
    }

    public void pay(ISalariedEmp iSalariedEmp){
        System.out.println("Salary: " + iSalariedEmp.getSalary());
    }

    public void pay(Employee employee){
        System.out.println("E: " + employee.getPayAmount());
    }
    public void pay(SalariedEmp salariedEmp){
        System.out.println("ES: " + salariedEmp.getPayAmount());
    }
    public void pay(HourlyEmp hourlyEmp){
        System.out.println("EH: " + hourlyEmp.getPayAmount());
    }

    public void sayName(){
        System.out.println("Accountants name: " + name);
    }

    public void pay(IPayable[] iPayables,int numberOfEmp){
        for(int i = 0; i < numberOfEmp; i++){
            IPayable iPayable = iPayables[i];
            pay(iPayable);
        }
    }

    public void pay(Employee[] employees, int numberOfEmp){
        for(int i = 0; i < numberOfEmp; i++){
            pay(employees[i]);
        }
    }
}
