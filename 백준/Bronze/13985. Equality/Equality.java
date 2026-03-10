import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        char plus = st.nextToken().charAt(0);
        int b = Integer.parseInt(st.nextToken());
        char equal = st.nextToken().charAt(0);
        int c = Integer.parseInt(st.nextToken());

        if (a + b == c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        br.close();
    }
}