import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int l = n == 0 ? 2 : n + 1;
        int[] arr = new int[l];

        arr[1] = 1;
        for (int i = 2; i < l; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]);
        }

        System.out.println(arr[n]);
        br.close();
    }
}