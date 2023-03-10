import java.util.Scanner;

class newPerson {
    Scanner sc = new Scanner(System.in);

    String name, gender;
    int age;

    newPerson() {
        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("Enter Gender");
        gender = sc.next();
        System.out.println("Enter age");
        age = sc.nextInt();
    }

    void display() {
        System.out.println("name " + name);
        System.out.println("gender " + gender);
        System.out.println("age " + age);
        System.out.println("Birth year : " + (2023 - age));
    }
}

public class Persons1 {
    public static void main(String[] args) {
        newPerson person = new newPerson();
        person.display();
    }
}