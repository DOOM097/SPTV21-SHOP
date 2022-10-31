package Entity;

import java.util.Arrays;

public class Product {
    private String productName;
    private Buyer[] buyers;
    private String quantity;
    private int price;

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName= productName;
    }

    public Buyer[] getBuyers() {
        return buyers;
    }

    public void setAuthors(Buyer[] buyers) {
        this.buyers = buyers;
    }

    public void addBuyer(Buyer buyer){
        Buyer[] newBuyer = Arrays.copyOf(buyers, buyers.length+1);
        newBuyer[newBuyer.length-1] = buyer;
        this.buyers = newBuyer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", buyers=" + Arrays.toString(buyers) +
                ", quantity='" + quantity + '\'' +
                ", price=" + price +
                '}';
    }

    public void setBuyers(Buyer[] createBuyers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}