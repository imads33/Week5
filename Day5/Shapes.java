class Shape{
    String color,filled;
}
class Rectangle extends Shape{
    float width=6,height7;

    float getArea(){
        float area=height*width;
        return area;
    }
}
public class Shapes{
    public static void main(String[] args){
        Rectangle r=new Rectangle();
        r.color="red";
        r.filled="yes";

        float area=r.getArea();

        System.out.println("Area is "+area);
    }
}