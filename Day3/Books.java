import java.util.Scanner;

class Book {
    Scanner sc = new Scanner(System.in);

    String name,title;
    int year;

    Book(String title,String name,int year) {
        this.title=title;
        this.name=name;
        this.year=year;
    }
    void display(){
        System.out.println("Title : "+title);
        System.out.println("Name : "+name);
        System.out.println("Year : "+year);
    }
}

public class Books {
    public static void main(String[] args) {
        Book book=new Book("OnePiece","Oda",2022);
    }
}