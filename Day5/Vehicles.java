/*Create a class called Vehicle with attributes make, model, and year. Create a subclass called Car that inherits from Vehicle and adds attributes color and num_doors. Create a method in Car called get_info() that prints out the make, model, year, color, and number of doors of the car.*/

class Vehicle{
    String make,model;
    int year;
}

class Car extends Vehicle{
    String color;
    int noOfDoors;

    void getInfo(){
        System.out.println("Make :"+make);
        System.out.println("Model :"+model);
        System.out.println("year :"+year);
        System.out.println("Color :"+color);
    }
}

public class Vehicles{
    public static void main(String[] args){
        Car c=new Car();

        c.make="XYZ";
        c.model="123Pqs";
        c.year=2022;
        c.color="red";
        c.noOfDoors=4;

        c.getInfo();
    }
}