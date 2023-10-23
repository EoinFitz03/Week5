package ie.atu;

import java.util.Scanner;

public class Person {

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public Person() {
    this.firstName="";
    this.lastName="";
    this.age=0;
    }

    private String firstName;

    private String lastName;
    private int age;

    public void displayInfo(){
        System.out.println("Name: "+firstName + " "+ lastName + ". age" + age );
    }

    public void getUserinput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.println("Enter last name: ");
        this.lastName = scanner.nextLine();

        System.out.println("Enter age: ");
        this.age = scanner.nextInt();

    }
}

