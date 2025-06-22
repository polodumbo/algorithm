import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int m = A * B * C;

        int[] arr = new int[10];
        while (m > 0) {
            arr[m % 10] += 1;
            m /= 10;
        }

        for (int i : arr) {
            sb.append(i).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}