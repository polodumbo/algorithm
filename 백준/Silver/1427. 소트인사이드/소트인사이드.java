import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> numList = new ArrayList<>();

        while (n > 0) {
            numList.add(n % 10);
            n /= 10;
        }

        Collections.sort(numList);
        Collections.reverse(numList);
        for (int i : numList) {
            sb.append(i);
        }

        System.out.println(sb);
        br.close();
    }
}