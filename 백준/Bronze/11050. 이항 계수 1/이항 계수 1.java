import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        System.out.println(getFactorial(N) / (getFactorial(M) * getFactorial(N - M)));
        br.close();
    }

    public static int getFactorial(int n) {
        int r = 1;
        for (int i = n; i >= 1; i--) {
            r *= i;
        }
        return r;
    }
}