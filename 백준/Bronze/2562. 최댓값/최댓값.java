import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            numList.add(Integer.parseInt(br.readLine()));
        }

        int max = Collections.max(numList);
        int index = numList.indexOf(max);

        sb.append(max).append("\n").append(index + 1);
        System.out.println(sb);
        br.close();
    }
}