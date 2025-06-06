import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> nums = new ArrayList<>();
        
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(br.readLine());
            nums.add(n);
            sum += n;
        }

        Collections.sort(nums);
        sb.append(sum / nums.size()).append("\n").append(nums.get(2));

        System.out.println(sb);
        br.close();
    }
}