import java.time.*;
import java.util.*;

public class test30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String date = sc.next();
        int totalNights = sc.nextInt();
        int stayedNights = sc.nextInt();

        LocalDate checkIn = LocalDate.parse(date);

        LocalDate checkOut = checkIn.plusDays(totalNights);

        int remaining = totalNights - stayedNights;

        System.out.println(checkOut);
        System.out.println(remaining);
        System.out.println(checkOut.getYear());
        System.out.println(checkOut.getMonthValue());
        sc.close();
    }
}