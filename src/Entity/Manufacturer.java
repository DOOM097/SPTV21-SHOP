package Entity;

public class Manufacturer {
    private String manufactirerName;

    public Manufacturer() {
    }

    public String manufactirerName() {
        return manufactirerName;
    }

    public Manufacturer setManufactirerName(String manufactirerName) {
        this.manufactirerName = manufactirerName;
        return this;
    }

    @Override
    public String toString() {
        return "Manufacturer{"
                + "manufacturerName='" + manufactirerName + '\''
                + '}';
    }
}
