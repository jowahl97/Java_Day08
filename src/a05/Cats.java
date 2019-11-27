package a05;

public class Cats extends Dogs {
    private boolean isAntiAllergy;

    public Cats(String productName, String productDescription, double productPrice, double weight, String race, boolean isAntiAllergy) {
        super(productName, productDescription, productPrice, weight, race);
        this.isAntiAllergy = isAntiAllergy;
    }

    public Cats() {

    }

    public boolean isAntiAllergy() {
        return isAntiAllergy;
    }

    public void setAntiAllergy(boolean antiAllergy) {
        isAntiAllergy = antiAllergy;
    }

    @Override
    public String toString() {
        return super.toString() + " Anti Allergy: " + isAntiAllergy;
    }
}
