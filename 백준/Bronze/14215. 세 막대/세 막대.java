import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] sticks = {a, b, c};
        Arrays.sort(sticks);

        if (sticks[0] + sticks[1] <= sticks[2]) {
            sticks[2] = sticks[0] + sticks[1] - 1;
        }

        System.out.println(Arrays.stream(sticks).sum());
    }
}