import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long lt = Long.parseLong(st.nextToken());
            long wt = Long.parseLong(st.nextToken());
            long le = Long.parseLong(st.nextToken());
            long we = Long.parseLong(st.nextToken());

            long at = lt * wt;
            long ae = le * we;

            if (at > ae) {
                sb.append("TelecomParisTech");
            } else if (at == ae) {
                sb.append("Tie");
            } else {
                sb.append("Eurecom");
            }
            sb.append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}