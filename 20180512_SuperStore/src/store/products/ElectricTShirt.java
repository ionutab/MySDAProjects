package store.products;

public class ElectricTShirt extends BasicProduct implements SizedProduct, ElectricProduct {

    int warranty;
    char size;

    @Override
    public int getWarranty() {
        return 0;
    }

    @Override
    public char getSize() {
        return 0;
    }
}
