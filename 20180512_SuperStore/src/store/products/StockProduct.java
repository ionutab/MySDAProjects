package store.products;

public class StockProduct extends BasicProduct {

    int stock = 0;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
