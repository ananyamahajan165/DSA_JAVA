import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replace(" ","").toLowerCase();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}
