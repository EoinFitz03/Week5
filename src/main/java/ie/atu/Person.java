package ie.atu;

public class Person {


    public Person(String firstName) {
        this.firstName = firstName;
    }
    public Person() {
    this.firstName="";
        this.lastName="";
        this.age=0;
    }

    private String firstName;


    private String lastName;
    private int age;
}

