import java.util.Scanner;
class Student {
    Scanner sc=new Scanner(System.in);
    String name;
    int age;
    float avrgGrade;

    Student() {
        System.out.println("Enter Name");
        name=sc.nextLine();
        System.out.println("Enter Age");
        age=sc.nextInt();

        calculateGrade();
    }

    void calculateGrade(){
        int sub1=0,sub2=0,sub3=0;
        System.out.println("Enter 3 subjects marks");
        System.out.println("Enter subject 1");
        sub1=sc.nextInt();
        System.out.println("Enter subject 2");
        sub1=sc.nextInt();
        System.out.println("Enter subject 3");
        sub1=sc.nextInt();

        avrgGrade=(sub1+sub2+sub3)/3;
        display();
    }

    public void display() {
        System.out.println("Name :" + name + "\nAge : "+ age + "\nAvrage grade : " + avrgGrade);
    }
}

public class Students {
    public static void main(String[] args) {
        Student student=new Student();
    }
}