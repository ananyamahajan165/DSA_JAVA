import java.time.LocalDate;
import java.util.Scanner;

public class test36 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        String startInput = sc.next();
        String endInput = sc.next();

        LocalDate start = LocalDate.parse(startInput);
        LocalDate end = LocalDate.parse(endInput);

        long days = java.time.temporal.ChronoUnit.DAYS.between(start, end);

        System.out.println(days);
        sc.close();
    }
}
