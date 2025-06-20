import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int l = n == 0 ? 2 : n + 1;
        BigInteger[] arr = new BigInteger[l];

        arr[0] = BigInteger.valueOf(0);
        arr[1] = BigInteger.valueOf(1);
        for (int i = 2; i < l; i++) {
            arr[i] = arr[i - 1].add(arr[i - 2]);
        }

        System.out.println(arr[n]);
        br.close();
    }
}