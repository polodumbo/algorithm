import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strtk = new StringTokenizer(br.readLine(), " ");

        int nClimb = Integer.parseInt(strtk.nextToken());
        int nFall = Integer.parseInt(strtk.nextToken());
        int nTop = Integer.parseInt(strtk.nextToken());

        br.close();

        int nDay = (nTop - nFall) / (nClimb - nFall);

        if ((nTop - nFall) % (nClimb -nFall) != 0) {
            nDay++;
        }

        System.out.println(nDay);
    }
}