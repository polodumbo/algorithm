import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> restList = new ArrayList<>();
        int d = 42;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            int rest = n % d;

            if (!restList.contains(rest)) {
                count++;
                restList.add(rest);
            }
        }

        System.out.println(count);
        br.close();
    }
}