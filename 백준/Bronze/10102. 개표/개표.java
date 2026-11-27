import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int V = Integer.parseInt(br.readLine());
        String vote = br.readLine();

        int countA = 0;
        int countB = 0;

        for (int i = 0; i < V; i++) {
            char c = vote.charAt(i);

            if (c == 'A') {
                countA++;
            } else {
                countB++;
            }
        }

        if (countA == countB) {
            System.out.println("Tie");
        } else {
            System.out.println(countA > countB ? 'A' : 'B');
        }
    }
}