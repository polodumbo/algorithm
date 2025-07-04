import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        sb.append(String.format("%.6f", N * N * Math.PI)).append('\n').append(String.format("%.6f", (double) N * 2 * N));

        System.out.println(sb);
        br.close();
    }
}