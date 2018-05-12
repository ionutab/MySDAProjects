package store.products;

public abstract class BasicProduct {
    public String name;
    public double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BasicProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
