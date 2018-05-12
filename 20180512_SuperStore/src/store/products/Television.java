package store.products;

public class Television extends StockProduct implements ElectricProduct {

    //public int stock = 0;
    //double price;
    int warranty;
    //String name;
    double diag;

    public Television (int warranty, String name, double price, double diag){
        this.warranty = warranty;
        this.name = name;
        this.price = price;
        this.diag = diag;
        //STOCK++;
    }

    public double getDiag(){
        return diag;
    }
    //public double getPrice(){
    //    return price;
    //}
    //public String getName(){
     //   return name;
    //}
//    public int getStock(){
//        return stock;
//    }
//    public void setStock(int stock){
//        this.stock = stock;
//    }
    public int getWarranty(){
        return warranty;
    }

    @Override
    public String toString() {
        return "Television{" +
                ", warranty=" + warranty +
                ", diag=" + diag +
                '}';
    }
}
