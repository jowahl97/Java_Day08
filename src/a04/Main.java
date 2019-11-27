package a04;

public class Main {
    public static void main(String[] args) {
        Student studentArray[] = new Student[5];
        studentArray[0] = new Student("Johannes", "Wahl", 1997, 22, "3d");
        studentArray[1] = new Student("Max", "Mustermann", 1996, 23, "4d");
        studentArray[2] = new Student("Maxine", "Musterfrau", 1995, 24, "3d");
        studentArray[3] = new Student("Simon", "Mannmuster", 1998, 21, "3b");
        studentArray[4] = new Student("Simone", "Fraumuster", 1999, 20, "3b");

        for (Student student : studentArray) {
            student.printStudent();
        }

    }
}
