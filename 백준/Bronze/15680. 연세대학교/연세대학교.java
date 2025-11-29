import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String name = "YONSEI";
        String slogan = "Leading the Way to the Future";

        System.out.println(N == 0 ? name : slogan);
        br.close();
    }
}