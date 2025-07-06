import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int seat = 0;
        for (int i = 0; i < 2; i++) {
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            seat += n * k;
        }
        System.out.println(seat);
        br.close();
    }
}