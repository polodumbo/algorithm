import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> numList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            numList.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(numList);

        for (int n : numList) {
            sb.append(n).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}