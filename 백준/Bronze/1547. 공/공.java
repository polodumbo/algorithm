import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[4];
        arr[1] = true;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            boolean temp = arr[y];
            arr[y] = arr[x];
            arr[x] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            boolean b = arr[i];
            if (b) {
                System.out.println(i);
            }
        }
        br.close();
    }
}