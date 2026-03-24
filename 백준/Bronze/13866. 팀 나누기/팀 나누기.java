import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] players = new int[4];

        for (int i = 0; i < players.length; i++) {
            players[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(players);

        System.out.println(Math.abs((players[0] + players[3]) - (players[1] + players[2])));
        br.close();
    }
}