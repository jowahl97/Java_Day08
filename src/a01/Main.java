package a01;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Max", "Mustermann", 1990, 2500.98);
        Employee employee2 = new Employee("Simone", "Musterfrau", 1988, 2600.88);
        Employee employee3 = new Employee("Maxine", "Fraumuster", 1980, 3081.75);
        Employee employee4 = new Employee("Johannes", "Wahl", 1997, 5321.76);

        System.out.println(employee1.getName());
        System.out.println(employee2.getSurName());
        System.out.println(employee3.getYearOfBirth());
        System.out.println(employee4.getSalary());

    }
}
