class Invoice {
    String name, product;
    int quantity;
    double price, totalPrice;

    Invoice(String name, String product, double price, int quantity) {
        this.name = name;
        this.product = product;
        this.quantity = quantity;
        this.price = price;

        totalPrice = price * quantity;
    }

    void display() {
        System.out.println("name : " + name);
        System.out.println("product : " + product);
        System.out.println("quantity : " + quantity);
        System.out.println("price : " + price);
        System.out.println("totalPrice : " + totalPrice);
    }
}

public class Invoices {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("imad", "Books", 120, 2);
        invoice.display();
    }
}