import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int YEAR = 1946;
        int N = Integer.parseInt(br.readLine());
        System.out.println(N - YEAR);
        br.close();
    }
}