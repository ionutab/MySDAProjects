import store.ClothesSizesEnum;
import store.Store;
import store.ClothesSizes;
import store.products.ElectricTShirt;
import store.products.Television;
import store.products.Tshirt;

public class Main {

    public static int DEFAULT_STORE_SIZE = 20;

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Store store = new Store(DEFAULT_STORE_SIZE);

        Tshirt tshirt = new Tshirt(ClothesSizesEnum.SIZE_M.value, "blueTshirt", 30.00);
        Television TV = new Television(12, "Panasonic", 1100.00, 95.00);
        ElectricTShirt electricTShirt = new ElectricTShirt("Fancy TShirt", 40.00, 2, ClothesSizes.SIZE_L);

        store.addProduct(tshirt);
        store.addProduct(TV);
        store.addProduct(electricTShirt);
        //store.showProducts();
        store.showProducts();

        store.addStock("blueTshirt", 30);
        store.addStock("blueTshirt", 10);

        store.sellItem("blueTshirt");
        store.sellItem("blueTshirt", 5);

        store.showProducts();

//        System.out.println(ClothesSizesEnum.SIZE_S);
//        System.out.println(ClothesSizesEnum.SIZE_L);
        for(int i = 0; i < ClothesSizesEnum.values().length; i++){
            System.out.println(ClothesSizesEnum.values()[i].value);
        }
    }
}
