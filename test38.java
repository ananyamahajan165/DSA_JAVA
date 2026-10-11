import java.util.Scanner;

public class test38 {
    static int calculateMarks(int a,int b,int c){
        int marks[]={a,b,c};
        int total=0;
        for(int mark : marks){
            total+=mark;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int total = calculateMarks(a, b, c);
        System.out.println(total);
        sc.close();
    }
}
