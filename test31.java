import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class test31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        String time = sc.next();
        int duration = sc.nextInt();
        LocalDate examDate = LocalDate.parse(date);
        LocalTime startTime = LocalTime.parse(time);
        LocalDateTime start = LocalDateTime.of(examDate, startTime);
        LocalDateTime endTime = start.plusMinutes(duration);
        System.out.println(endTime.toLocalDate());
        System.out.println(endTime.toLocalTime());
        System.out.println(endTime.getYear());
        System.out.println(endTime.getMonthValue());
        System.out.println(endTime.getHour());
        sc.close();
    }
}
