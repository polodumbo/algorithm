import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int gcd = arr[1] - arr[0];
        for (int i = 0; i < N - 1; i++) {
            gcd = getGCD(arr[i + 1] - arr[i], gcd);
        }

        System.out.println((arr[arr.length - 1] - arr[0]) / gcd - arr.length + 1);
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