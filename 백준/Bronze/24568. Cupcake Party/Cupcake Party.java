import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int studentNum = 28;
        int rNum = 8;
        int R = Integer.parseInt(br.readLine());
        int sNum = 3;
        int S = Integer.parseInt(br.readLine());

        int left = (R * rNum + S * sNum) - studentNum;
        if (left < 0) {
            left = 0;
        }

        System.out.println(left);
        br.close();
    }
}