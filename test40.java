import java.util.*;

public class test40 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int basic = sc.nextInt();
        int allowance = sc.nextInt();
        int deduction = sc.nextInt();

        int finalSalary = basic + allowance - deduction;

        System.out.println(finalSalary);
        sc.close();
    }
}