import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean isPassed = false;
        while (!isPassed) {
            String str = String.valueOf(N);
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (!(c == '4' || c == '7')) {
                    break;
                }

                if (i == str.length() - 1) {
                    isPassed = true;
                }
            }
            N--;
        }

        System.out.println(N + 1);
        br.close();
    }
}