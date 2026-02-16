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
            double x = Double.parseDouble(st.nextToken());
            double y = Double.parseDouble(st.nextToken());

            if (x == 0.0 || y == 0.0) {
                sb.append("AXIS");
            } else if (x > 0.0 && y > 0.0) {
                sb.append("Q1");
            } else if (x < 0.0 && y > 0.0) {
                sb.append("Q2");
            } else if (x < 0.0 && y < 0.0) {
                sb.append("Q3");
            } else {
                sb.append("Q4");
            }
            sb.append('\n');

            if (x == 0.0 && y == 0.0) {
                break;
            }
        }

        System.out.println(sb);
        br.close();
    }
}