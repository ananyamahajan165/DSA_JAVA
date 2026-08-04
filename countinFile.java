import java.util.Scanner;
import java.io.*;

public class countinFile {
    static int countWord(String filename,String target) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(filename));
        int count=0;
        String line;
        while((line = br.readLine())!=null){
            String words[] = line.split("\\s+");
            for(int i=0;i<words.length;i++){
                if(words[i].equals(target)){
                    count++;
                }
            }
        }
        br.close();
        return count;
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String fileName = scn.nextLine();
        String target = scn.next();
        int ans = countWord(fileName, target);
        System.out.println(ans);
        scn.close();
    }
}
