import java.util.Scanner;

class Circle {
    Scanner sc = new Scanner(System.in);

    double radius, area, diameter;

    Circle(int radius) {
        this.radius=radius;
        diameter = 2 * radius;
        System.out.println("Perimeter : " + diameter);
        calculateArea();
    }

    void calculateArea() {
        area = 3.14 * radius * radius;
        System.out.println("Area is : " + area);
    }
}

public class Circles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius;
        System.out.println("Enter radius");
        radius = sc.nextInt();
        Circle circle = new Circle(radius);
    }
}