import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine()) - 1;
        int month = N * 7;
        int firstYear = 2024;
        int firstMonth = 8;

        int resultYear = firstYear + (firstMonth + month) / 12;
        int resultMonth = (firstMonth + month) % 12;
        if (resultMonth == 0) {
            resultYear--;
            resultMonth = 12;
        }

        sb.append(resultYear).append(' ');
        sb.append(resultMonth);

        System.out.println(sb);
        br.close();
    }
}