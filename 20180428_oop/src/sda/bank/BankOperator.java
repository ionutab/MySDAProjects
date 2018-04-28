package sda.bank;

import sda.school.Person;

public class BankOperator extends Person {

    public BankOperator(String name, Integer age) {
        super(name, age);
        System.out.println("Constructed bankoperator");

    }

    public void changeIBAN(Account a, String iban){
        a.iban = iban;
    }

    public void showPerson(){
        System.out.println("BankOperator");
        System.out.println(this.name);
        System.out.println(this.age);

//        System.out.println(this.cnp);
//        System.out.println(this.address);
    }

    public void showPerson2(){
        System.out.println("BankOperator");
        super.showPerson2();
    }

    public String toString() {
        return "BankOperator{}";
    }
}
