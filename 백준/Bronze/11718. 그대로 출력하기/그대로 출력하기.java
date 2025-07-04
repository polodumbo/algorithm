import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = null;
        while((str = br.readLine()) != null) {
            sb.append(str).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}