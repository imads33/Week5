/* MULTILEVEL INHERITANCE */
class Vehicle{
    String make,model;
}

class Car extends Vehicle{
    int noOfDoors;
}

class SportsCar extends Car{
    int topSpeed;
    void revEngine(){
        System.out.println("Vhrooommm !");
    }
}

public class VehiclesMP{
    public static void main(String[] args){
        SportsCar sc=new SportsCar();

        sc.make="XYZ";
        sc.model="123Pqs";
        sc.noOfDoors=4;
        sc.revEngine();
    }
}