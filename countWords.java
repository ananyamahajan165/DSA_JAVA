import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class countWords {
    static int countwords(String filename) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(filename));
        int count=0;
        String line;
        while((line=br.readLine())!=null){
            String words[] = line.split(" ");
            count+=words.length;
        }
        br.close();
        return count;
    }
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        String fileName = scn.nextLine();
        System.out.println(countwords(fileName));
        scn.close();
    }
}
