import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numList.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(numList);

        int cut = (int) Math.round(n * 0.15);
        int total = 0;

        for (int i = cut; i < n - cut; i++) {
            total += numList.get(i);
        }

        int grade = (int) Math.round((double) total / (n - cut * 2));

        System.out.println(grade);
        br.close();
    }
}