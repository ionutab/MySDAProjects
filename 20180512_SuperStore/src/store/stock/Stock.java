package store.stock;

import store.products.Product;

public class Stock {
    Product product;
    int nrOfItems;

    public Stock(Product product, int nrOfItems) {
        this.product = product;
        this.nrOfItems = nrOfItems;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getNrOfItems() {
        return nrOfItems;
    }

    public void setNrOfItems(int nrOfItems) {
        this.nrOfItems = nrOfItems;
    }
}
