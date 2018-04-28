public class Main {

    public static void main(String[] args) {

        A a1 = new A();
        a1.description = "a instance";
        System.out.println(a1);

        B b = new B("b instance");
        System.out.println(b);

        B2 b2 = new B2("b2 instance");
        System.out.println(b);

        C c = new C();
        c.description = "c instance";
        System.out.println(c);

        D d = new D("d instance");
        System.out.println(d);

        E e1 = new E();
        e1.description = "e instance";
        System.out.println(e1);

        F f1 = new F();
        f1.setDescription("f instance");
        System.out.println(f1);
        System.out.println(f1.showSuperClass());

        G g = new G();
    }
}
