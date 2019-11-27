package a05;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Football", "Sportsstuff", 19.99);
        System.out.println(product1.toString());
        PhysicalBook physicalBook1 = new PhysicalBook("The Hobbit", "Fantasy", 25.99, 0.25);
        System.out.println(physicalBook1.toString());
        ElectronicBook electronicBook1 = new ElectronicBook("Atlas", "Geography", 15.99, "https://atlas.com");
        System.out.println(electronicBook1.toString());
        Dogs dogs1 = new Dogs("Fosters", "Dog", 999.99, 5.0, "Husky");
        System.out.println(dogs1.toString());
        Cats cats1 = new Cats("Loui", "Cat", 599.99, 2.0, "Maine Coon", true);
        System.out.println(cats1.toString());
    }
}
