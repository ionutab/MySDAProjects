package store;

import store.products.Product;

public class Store {

    int nrOfProducts = 0;
    Product[] products;

    public Store(int capacity) {
        products = new Product[capacity];
//        items = new Stock[capacity];
    }

    public void addProduct(Product product) {
        addProduct(product, 0);
    }

    public void addProduct(Product product, int nrOfItems) {
        products[nrOfProducts] = product;
        nrOfProducts++;
        product.setStock(product.getStock() + nrOfItems);
    }

//    public void addStock(Product product, int nrOfItems) {
//        Stock stock = new Stock(product, nrOfItems);
////        items[nrOfProducts] = stock;
//        nrOfProducts++;
//    }
/*
    public void showProducts() {
        System.out.println();
        for (int i = 0; i < nrOfProducts; i++) {
            System.out.println(items[i].getProduct());

        }
    }
    */
    public void showProducts() {
        System.out.println();
        for (int i = 0; i < nrOfProducts; i++) {
            System.out.println(products[i]);
        }
    }

    public void addStock(String productName, int stock){

    }

    public void sellItem(String productName){

    }

    public void sellItem(String productName, int amout){

    }

}
