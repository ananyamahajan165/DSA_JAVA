import java.util.*;

public class test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int originalAmount = sc.nextInt();
        double discountPercentage = sc.nextDouble();
        double servicePercentage = sc.nextDouble();

        double discount = originalAmount * discountPercentage / 100;

        double amountAfterDiscount = originalAmount - discount;

        double serviceCharge = amountAfterDiscount * servicePercentage / 100;

        double finalAmount = originalAmount - discount + serviceCharge;

        System.out.printf("%.2f", finalAmount);
        sc.close();
    }
}