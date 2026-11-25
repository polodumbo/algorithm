import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        
        int n = Integer.parseInt(line.trim()) % 8;
        int answer = 0;
        
        if (n == 0) {
            answer = 2;
        } else if (n > 5) {
            answer = 10 - n;
        } else {
            answer = n;
        }

        System.out.println(answer);
    }
}