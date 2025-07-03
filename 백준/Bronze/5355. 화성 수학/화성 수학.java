import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double d = Double.parseDouble(st.nextToken());
            int l = st.countTokens();
            for (int j = 0; j < l; j++) {
                char c = st.nextToken().charAt(0);
                d = getCal(d, c);
            }
            sb.append(String.format("%.2f", d)).append('\n');
        }

        System.out.println(sb);
        br.close();
    }

    static double getCal(double d, char operator) {
        switch (operator) {
            case '@':
                d *= 3;
                break;
            case '%':
                d += 5;
                break;
            case '#':
                d -= 7;
                break;
        }
        return d;
    }
}