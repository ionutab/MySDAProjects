package emp;

public interface IAccountingEmp {

    public void pay(ISalariedEmp iSalariedEmp);
    public void pay(IHourlyEmp iHourlyEmp);
    public void pay(IPayable iPayable);

}
