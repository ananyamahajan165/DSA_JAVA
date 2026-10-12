import java.io.*;
import java.util.StringTokenizer;

public class test43 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {

            int temperature = Integer.parseInt(st.nextToken());

            int processed = temperature + 2;

            sb.append(processed);

            if (i < n - 1) {
                sb.append(" ");
            }
        }

        System.out.println(sb);
    }
}
