import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double a = Math.pow(Double.parseDouble(st.nextToken()), 2);
            double b = Math.pow(Double.parseDouble(st.nextToken()), 2);
            double c = Math.pow(Double.parseDouble(st.nextToken()), 2);

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            double max = Math.max(Math.max(a, b), c);

            if (max * 2 == a + b + c) {
                sb.append("right");
            } else {
                sb.append("wrong");
            }
            sb.append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}