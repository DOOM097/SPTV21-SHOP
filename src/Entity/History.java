package Entity;

import java.util.Date;

public class History {
    private Product product;
    private Buyer buyer;
    private Date takeOnBook;

    public History() {
    }

    public Product product() {
        return product;
    }

    public History setProduct(Product product) {
        this.product = product;
        return this;
    }

    public Buyer buyer() {
        return buyer;
    }

    public History setBuyer(Buyer buyer) {
        this.buyer = buyer;
        return this;
    }

    public Date takeOnBook() {
        return takeOnBook;
    }

    public History setTakeOnBook(Date takeOnBook) {
        this.takeOnBook = takeOnBook;
        return this;
    }

    @Override
    public String toString() {
        return "History{" +
                "product=" + product +
                ", buyer=" + buyer +
                ", takeOnBook=" + takeOnBook +
                '}';
    }
}
