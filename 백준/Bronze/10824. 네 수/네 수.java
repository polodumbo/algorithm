import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long AB = Long.parseLong(st.nextToken() + st.nextToken());
        long CD = Long.parseLong(st.nextToken() + st.nextToken());
        System.out.println(AB + CD);
        br.close();
    }
}