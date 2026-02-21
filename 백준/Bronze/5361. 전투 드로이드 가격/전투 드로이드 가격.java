import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[] prices = {350.34, 230.90, 190.55, 125.30, 180.90};
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double price = 0.0;

            for (int j = 0; j < 5; j++) {
                int n = Integer.parseInt(st.nextToken());
                price += prices[j] * n;
            }

            sb.append('$').append(String.format("%.2f",price)).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}