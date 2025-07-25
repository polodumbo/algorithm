import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        System.out.println(getRev(getRev(X) + getRev(Y)));
        br.close();
    }

    public static int getRev(int n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        return Integer.parseInt(sb.reverse().toString());
    }
}