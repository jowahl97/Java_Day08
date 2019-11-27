package a04;

import java.sql.SQLOutput;

public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private int age;
    private String schoolClass;

    public Student(String firstName, String lastName, int yearOfBirth, int age, String schoolClass) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.age = age;
        this.schoolClass = schoolClass;
    }

    public Student() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(String schoolClass) {
        this.schoolClass = schoolClass;
    }

    public void printStudent() {
        System.out.println(firstName + " " + lastName + ", born on " + yearOfBirth + ", age " + age + ", goes to class " + schoolClass);
    }
}
