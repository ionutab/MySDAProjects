package store;

import store.products.Product;
import store.stock.Stock;

public class Store {

    int nrOfProducts = 0;
    //Product[] products;
    Stock[] items;

    public Store(int capacity) {
        //products = new Product[capacity];
        items = new Stock[capacity];
    }

    public void addProduct(Product product, int nrOfItems) {
        //products[nrOfProducts] = product;
        nrOfProducts++;
        product.setStock(product.getStock() + nrOfItems);
    }

    public void addStock(Product product, int nrOfItems) {
        Stock stock = new Stock(product, nrOfItems);
        items[nrOfProducts] = stock;
        nrOfProducts++;

    }

    public void showProducts() {
        System.out.println();
        for (int i = 0; i < nrOfProducts; i++) {
            System.out.println(items[i].getProduct());

        }
    }

}
