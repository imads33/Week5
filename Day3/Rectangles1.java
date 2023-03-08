import java.util.Scanner;

class Rectangle1 {
    Scanner sc = new Scanner(System.in);

    int area, perimeter;

    Rectangle1(int length, int width) {
        area = length * width;
        perimeter = 2 * length + 2 * width;

        System.out.println("Area is : " + area);
        System.out.println("Perimeter : " + perimeter);
    }
}

public class Rectangles1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length, width;
        System.out.println("Enter length");
        length = sc.nextInt();
        System.out.println("Enter widtgh");
        width = sc.nextInt();
        Rectangle1 rectangle = new Rectangle1(length, width);
    }
}