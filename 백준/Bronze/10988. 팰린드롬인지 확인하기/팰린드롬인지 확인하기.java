import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        StringBuilder sbFront = new StringBuilder();

        int mid = str.length() / 2;
        sbFront.append(str, 0, mid);
        sb.append(sbFront).append(sbFront.reverse());
        if (str.length() % 2 == 1) {
            sb.insert(mid, str.charAt(mid));
        }

        System.out.println(str.equals(sb.toString()) ? 1 : 0);
        br.close();
    }
}