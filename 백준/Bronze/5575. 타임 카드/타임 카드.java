import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int inHour = Integer.parseInt(st.nextToken());
            int inMin = Integer.parseInt(st.nextToken());
            int inSec = Integer.parseInt(st.nextToken());
            int inTime = inHour * 60 * 60 + inMin * 60 + inSec;

            int outHour = Integer.parseInt(st.nextToken());
            int outMin = Integer.parseInt(st.nextToken());
            int outSec = Integer.parseInt(st.nextToken());
            int outTime = outHour * 60 * 60 + outMin * 60 + outSec;

            int workTime = outTime - inTime;
            int sec = workTime % 60;
            workTime /= 60;
            int min = workTime % 60;
            int hour = workTime / 60;

            sb.append(hour).append(' ')
                .append(min).append(' ')
                .append(sec).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}