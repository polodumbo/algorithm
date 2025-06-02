import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double scoreTotal = 0.0, scoreGrade = 0.0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String strGrade = st.nextToken();
            double grade = 0.0;

            if (strGrade.charAt(0) == 'P') continue;
            switch (strGrade.charAt(0)) {
                case 'A':
                    grade = 4.0;
                    break;
                case 'B':
                    grade = 3.0;
                    break;
                case 'C':
                    grade = 2.0;
                    break;
                case 'D':
                    grade = 1.0;
                    break;
            }
            if (strGrade.charAt(0) != 'F' && strGrade.charAt(1) == '+') {
                grade += 0.5;
            }

            scoreGrade += score * grade;
            scoreTotal += score;
        }

        System.out.println(scoreGrade / scoreTotal);
        br.close();
    }
}