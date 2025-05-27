import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        String msg = "";

        if (A > B) {
            msg = ">";
        } else if (A < B) {
            msg = "<";
        } else if (A == B) {
            msg = "==";
        }
        
        System.out.println(msg);
    }
}