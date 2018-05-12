import store.Store;
import store.StoreUtils;
import store.products.Television;
import store.products.Tshirt;

public class Main {

    public static int DEFAULT_STORE_SIZE = 20;

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Store store = new Store(DEFAULT_STORE_SIZE);
        Tshirt tshirt = new Tshirt(StoreUtils.SIZE_M, "blueTshirt", 30.00);
        Television TV = new Television(12, "Panasonic", 1100.00, 95.00);
        store.addProduct(tshirt);
        //store.showProducts();
        store.addProduct(TV);
        store.showProducts();


    }
}
