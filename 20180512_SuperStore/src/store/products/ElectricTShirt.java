package store.products;

public class ElectricTShirt extends StockProduct implements SizedProduct, ElectricProduct {

    int warranty;
    char size;

    public ElectricTShirt(String name, double price, int warranty, char size){
        this.name = name;
        this.price = price;
        this.warranty = warranty;
        this.size = size;
    }

    @Override
    public int getWarranty() {
        return warranty;
    }

    @Override
    public char getSize() {
        return size;
    }


    @Override
    public String toString() {
        return "ElectricTShirt{" +
                "stock=" + stock +
                ", warranty=" + warranty +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
