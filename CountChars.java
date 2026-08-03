import java.util.Scanner;

public class CountChars {
    static void countChars(String str){
        int vowels=0;
        int conso=0;
        int digits=0;
        int special=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowels++;
                }
                conso++;
            }
            else if(Character.isDigit(ch)){
                digits++;
            }
            else if(ch!=' '){
                special++;
            }
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + conso);
        System.out.println("Digits = " + digits);
        System.out.println("Special = " + special);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        countChars(str);
        sc.close();
    }
}
