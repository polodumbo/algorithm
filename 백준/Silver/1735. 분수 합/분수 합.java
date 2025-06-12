import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int aA = Integer.parseInt(st.nextToken());
        int aB = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int bA = Integer.parseInt(st.nextToken());
        int bB = Integer.parseInt(st.nextToken());

        int s = aA * bB + bA * aB;
        int m = aB * bB;
        int gcd = getGCD(Math.max(s, m), Math.min(s, m));
        if (gcd > 1) {
            s /= gcd;
            m /= gcd;
        }

        System.out.println(s + " " + m);
        br.close();
    }

    public static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}