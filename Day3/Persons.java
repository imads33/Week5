import java.util.Scanner;

class Person {
    Scanner sc = new Scanner(System.in);

    String name, address;
    int age;

    Person(String name, int age) {
        this.age = age;
        this.name = name;

        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Address : " + this.address);
    }
}

public class Persons {
    public static void main(String[] args) {
        Person person = new Person("imad", 22);
    }
}