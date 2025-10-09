import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char grade = str.charAt(0);

        double score = 0.0;
        if (grade == 'A') {
            score = 4.0;
        } else if (grade == 'B') {
            score = 3.0;
        } else if (grade == 'C') {
            score = 2.0;
        } else if (grade == 'D') {
            score = 1.0;
        }

        if (grade != 'F') {
            char detail = str.charAt(1);
            if (detail == '+') {
                score += 0.3;
            } else if (detail == '-') {
                score -= 0.3;
            }
        }

        System.out.println(score);

        br.close();
    }
}