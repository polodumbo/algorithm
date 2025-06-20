import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int rCnt, dCnt;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];

        rFibonacci(n);
        dFibonacci(n);

        sb.append(rCnt).append(' ').append(dCnt);
        System.out.println(sb);
        br.close();
    }

    static int rFibonacci(int n) {
        if (n == 1 || n == 2) {
            rCnt++;
            return 1;
        }
        return rFibonacci(n - 1) + rFibonacci(n - 2);
    }

    static int dFibonacci(int n) {
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            dCnt++;
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        return arr[n];
    }
}