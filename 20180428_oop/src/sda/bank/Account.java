package sda.bank;

public class Account {

    private Double money = 0.00;

    protected String iban;

//    public Account(){
//
//    }
//
    public Account(String iban){
        this.iban = iban;
    }

    public Account(String iban, Double money){
        this.iban = iban;
        this.money = money;
    }

    public void addMoney(Double sum){
        System.out.println("adding: " + sum);
        money = money + sum;
    }

    public void spendMoney(Double sum){
        System.out.println("spending: " + sum);
        money = money - sum;
    }

    public void showMoney(){
        System.out.println("balance: " + money);
    }

}
