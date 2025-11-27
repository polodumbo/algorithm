import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int basePrice = Integer.parseInt(st.nextToken());
        int extraPrice = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int kwh = Integer.parseInt(br.readLine());
            int fee = 0;

            if (kwh <= 1000) {
                fee = kwh * basePrice;
            } else {
                fee = 1000 * basePrice + (kwh - 1000) * extraPrice;
            }

            sb.append(kwh).append(' ').append(fee).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}