class Cars {
    String name, model, make, color;
    int year;

    Cars() {
        name = "XYZ";
        model = "23XYZ";
        make = "ABC";
        color = "black";
        year = 2020;
    }

    public void display() {
        System.out.println("Make : " + make + "\nModel : " + model + 
        "\nName :" + name + "\nColor : "+ color + "\nYear : " + year);
    }
}

public class Vehicles {
    public static void main(String[] args) {
        Cars car = new Cars();
        car.display();
    }
}