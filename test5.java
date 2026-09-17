import java.util.*;

class Product {

    int productId;
    double price;
    int quantity;

    Product(int productId, double price, int quantity) {
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateValue() {
        return price * quantity;
    }
}

public class test5  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();

        Product p = new Product(id, price, quantity);
        System.out.printf("%.2f" ,p.calculateValue());
        sc.close();
    }
}