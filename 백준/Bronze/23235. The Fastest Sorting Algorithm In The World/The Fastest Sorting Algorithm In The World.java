import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int count = 0;
        while (true) {
            String str = br.readLine();
            if (str.length() == 1 && str.charAt(0) == '0') {
                break;
            }

            count++;
            sb.append("Case ")
                    .append(count)
                    .append(": Sorting... done!")
                    .append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}