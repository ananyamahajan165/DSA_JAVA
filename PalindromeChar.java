import java.util.Scanner;

public class PalindromeChar {
    static boolean palindromechar(String str){
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        if(palindromechar(str)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not a palindrome");
        }
        scn.close();
    }
}
