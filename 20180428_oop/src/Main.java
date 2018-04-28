import sda.bank.Account;
import sda.bank.BankOperator;
import sda.school.Person;
import sda.school.Teacher;

public class Main {

    public static void stage1(){

//        Person p1 = new Person();
//        p1.name = "Jimmy";
////        p1.age = 33;
//
//        Person p2 = new Person();
//        p2.name = "Tommy";
////        p2.age = 27;
//
//        p1.sayName();
//        p1.sayAge();
//        p2.sayName();
//        p2.sayAge();
//
//        p1.changeName("Jack");
//        p1.sayName();
//
//        System.out.println("----");
//        System.out.println("acc1");
//        Account a1 = new Account("iban1");
//        a1.showMoney();
//        a1.addMoney(2000.00);
//        a1.showMoney();
//        a1.spendMoney(300.00);
//        a1.showMoney();
//        System.out.println("----");
//        System.out.println("acc2");
//        Account a2 = new Account("iban2", 20.00);
//        a2.showMoney();
//        a2.addMoney(500.00);
//        a2.showMoney();
    }

    public static void stage2(){

        Teacher teacher = new Teacher("Jimmy", 30);
        teacher.sayName();
        teacher.sayAge();

        BankOperator bankOperator = new BankOperator("Linda", 38);
        bankOperator.sayName();
        bankOperator.sayAge();

        Person person = new Person("Alex", 22);
        person.sayName();
        person.sayAge();
    }

    public static void stage3(){

        Teacher teacher = new Teacher("Jimmy", 30);
        teacher.showPerson();

        BankOperator bankOperator = new BankOperator("Linda", 38);
        bankOperator.showPerson();

        Person person = new Person("Alex", 22);
        person.showPerson();
    }

    public static void stage4(){

        Teacher teacher = new Teacher("Jimmy", 30);
        teacher.showPerson2();

        BankOperator bankOperator = new BankOperator("Linda", 38);
        bankOperator.showPerson2();

        Person person = new Person("Alex", 22);
        person.showPerson2();
    }

    public static void stage5(){

        Teacher teacher = new Teacher("Jimmy", 30);
        System.out.println(teacher);

        BankOperator bankOperator = new BankOperator("Linda", 38);
        System.out.println(bankOperator);

        Person person = new Person("Alex", 22);
        System.out.println(person);
    }

    public static void main(String[] args) {

        stage5();

    }
}
