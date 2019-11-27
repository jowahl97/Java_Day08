package a05;

public class ElectronicBook extends Book {
    private String url;

    public ElectronicBook(String productName, String productDescription, double productPrice, String url) {
        super(productName, productDescription, productPrice);
        this.url = url;
    }

    public ElectronicBook() {

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return super.toString() + " URL: " + url;
    }
}
