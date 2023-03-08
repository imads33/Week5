import java.util.Scanner;

class Rectangle {
    Scanner sc = new Scanner(System.in);

    Rectangle() {
        calculate();
    }

    void calculate() {
        int length, width, area, perimeter;

        System.out.println("Enter length");
        length = sc.nextInt();
        System.out.println("Enter widtgh");
        width = sc.nextInt();

        area = length * width;
        perimeter = 2 * length + 2 * width;

        System.out.println("Area is : " + area);
        System.out.println("Perimeter : " + perimeter);

    }
}

public class Rectangles {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
    }
}