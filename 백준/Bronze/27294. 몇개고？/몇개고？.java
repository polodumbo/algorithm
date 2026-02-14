import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int alcohol = Integer.parseInt(st.nextToken());

        if (alcohol == 1) {
            System.out.println(280);
        } else  {
            if (hour >= 12 && hour <= 16) {
                System.out.println(320);
            } else {
                System.out.println(280);
            }
        }
        br.close();
    }
}