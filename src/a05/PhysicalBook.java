package a05;

public class PhysicalBook extends Book {
    private double weight;

    public PhysicalBook(String productName, String productDescription, double productPrice, double weight) {
        super(productName, productDescription, productPrice);
        this.weight = weight;
    }

    public PhysicalBook() {

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + " Weight: " + weight + " kg ";
    }
}
