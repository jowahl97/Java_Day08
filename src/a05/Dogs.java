package a05;

public class Dogs extends PhysicalBook {
    private String race;

    public Dogs(String productName, String productDescription, double productPrice, double weight, String race) {
        super(productName, productDescription, productPrice, weight);
        this.race = race;
    }

    public Dogs() {

    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return super.toString() + " Race: " + race;
    }
}
