import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int scoreP = 0;
        int scoreE = 0;

        int awayP = 0;
        int awayE = 0;

        // 앞 Persepolis
        StringTokenizer st = new StringTokenizer(br.readLine());
        scoreP += Integer.parseInt(st.nextToken());
        awayE += Integer.parseInt(st.nextToken());
        scoreE += awayE;

        // 앞 Esteghlal
        st = new StringTokenizer(br.readLine());
        scoreE += Integer.parseInt(st.nextToken());
        awayP += Integer.parseInt(st.nextToken());
        scoreP += awayP;

        if (scoreE > scoreP) {
            System.out.println("Esteghlal");
        } else if (scoreP > scoreE) {
            System.out.println("Persepolis");
        } else if (awayP == awayE) {
            System.out.println("Penalty");
        } else {
            System.out.println(awayP > awayE ? "Persepolis" : "Esteghlal");
        }

        br.close();
    }
}