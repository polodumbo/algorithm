import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long r = 1;
        int M = 1234567891;
        long result = 0;

        for (int i = 0; i < L; i++) {
            result += (str.charAt(i) - 'a' + 1) * r;
            r = r * 31 % M;
        }

        System.out.println(result % M);
        br.close();
    }
}