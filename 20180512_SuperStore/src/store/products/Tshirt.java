package store.products;

public class Tshirt extends StockProduct implements SizedProduct {

//    public int stock = 0;

    public char size;
    //public String name;
    //public double price;

    public Tshirt(char size, String name, double price) {
        this.size = size;
        this.name = name;
        this.price = price;
        //STOCK++;
    }

    public char getSize(){
        return size;
    }
    //public String getName(){
     //   return name;
    //}
    //public int getStock(){
//  //      return stock;
    //}
    //public double getPrice(){
     //   return price;
    //}

//    @Override
//    public void setStock(int stock) {
//        this.stock = stock;

    @Override
    public String toString() {
        return "Tshirt{" +
                "stock=" + stock +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

//    }
}
