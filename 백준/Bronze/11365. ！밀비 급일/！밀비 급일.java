import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true) {
            StringBuilder sbTemp = new StringBuilder(br.readLine());

            if (sbTemp.toString().equals("END")) {
                break;
            }

            sb.append(sbTemp.reverse()).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}