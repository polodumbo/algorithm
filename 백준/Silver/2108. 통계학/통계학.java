import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] numArr = new int[N];
        int total = 0;

        // 최빈값
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> countList = new ArrayList<>();
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            numArr[i] = n;
            total += n;

            // 최빈값
            int v = countMap.getOrDefault(n, 0) + 1;
            countMap.put(n, v);

            if (v > maxValue) {
                maxValue = v;
                countList.clear();
                countList.add(n);
            } else if (v == maxValue) {
                countList.add(n);
            }
        }

        Arrays.sort(numArr);
        Collections.sort(countList);

        sb.append(Math.round((double) total / N)).append('\n'); // 산술평균
        sb.append(numArr[(N - 1) / 2]).append('\n'); // 중앙값
        if (countList.size() > 1) {
            sb.append(countList.get(1)).append('\n');  // 최빈값 겹칩
        } else {
            sb.append(countList.get(0)).append('\n'); // 최빈값 하나
        }
        sb.append(numArr[N - 1] - numArr[0]).append('\n'); // 범위

        System.out.println(sb);
        br.close();
    }
}