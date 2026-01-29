import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            sb.append(x).append(" is ");

            if (x % 2 == 0) {
                sb.append("even");
            } else {
                sb.append("odd");
            }
            sb.append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}