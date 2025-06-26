import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int B1 = Integer.parseInt(br.readLine());
        int B2 = Integer.parseInt(br.readLine());
        int B3 = Integer.parseInt(br.readLine());
        int S1 = Integer.parseInt(br.readLine());
        int S2 = Integer.parseInt(br.readLine());

        System.out.println(Math.min(Math.min(B1, B2), B3) + Math.min(S1, S2) - 50);
        br.close();
    }
}