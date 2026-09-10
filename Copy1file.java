import java.util.*;
import java.io.*;
public class Copy1file {
    static void copyFile(String input, String output) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(input));
        PrintWriter pw = new PrintWriter(output);
        String line;
        int lineNo = 1;
        while ((line = br.readLine()) != null) {
            pw.println(lineNo + ". " + line);
            lineNo++;
        }
        br.close();
        pw.close();
    }
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = sc.nextLine();
        copyFile(input, output);
        System.out.println("File Copied Successfully");
        sc.close();
    }
}

