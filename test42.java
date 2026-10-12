import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test42 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.println(sum);
    }
}
