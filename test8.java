import java.util.Scanner;

public class test8 {
    static char calculateGrade(int marks){
        if(marks>=90){
            return 'A';
        }else if(marks>=75){
            return 'B';
        }else if(marks>=60){
            return 'C';
        }else if(marks>=40){
            return 'D';
        }else{
            return 'F';
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int marks = sc.nextInt();
            System.out.print(calculateGrade(marks));
            if(i<n-1){
                System.out.print(" ");
            }
        }
        sc.close();
    }
}
