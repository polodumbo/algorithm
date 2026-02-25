import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = (int) Math.floor(Double.parseDouble(br.readLine()));
        System.out.println(x);

        br.close();
    }
}