package store.products;

public class ElectricTShirt extends StockProduct implements SizedProduct, ElectricProduct {

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
