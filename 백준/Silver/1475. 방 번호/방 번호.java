import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];

        String N = br.readLine();
        for (int i = 0; i < N.length(); i++) {
            int n = N.charAt(i) - '0';
            arr[n] += 1;
        }

        int max = 0;
        int sixNine = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 6 || i == 9) {
                sixNine += arr[i];
            } else {
                max = Math.max(max, arr[i]);
            }
        }

        System.out.println(Math.max(max, sixNine / 2 + sixNine % 2));
        br.close();
    }
}