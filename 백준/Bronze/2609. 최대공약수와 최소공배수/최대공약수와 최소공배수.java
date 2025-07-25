import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int gcd = getGCD(Math.max(A, B), Math.min(A, B));
        int lcm = A * B / gcd;
        sb.append(gcd).append('\n').append(lcm);

        System.out.println(sb);
        br.close();
    }

    static int getGCD(int a, int b) {
        if (b == 0) return a;
        else return getGCD(b, a % b);
    }
}