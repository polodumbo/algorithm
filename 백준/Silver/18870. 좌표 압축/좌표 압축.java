import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        int[] numsSorted = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = numsSorted[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numsSorted);

        HashMap<Integer, Integer> hm = new HashMap<>();
        int index = 0;
        for (int i = 0; i < N; i++) {
            if (!hm.containsKey(numsSorted[i])) {
                hm.put(numsSorted[i], index++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(hm.get(nums[i])).append(" ");
        }

        System.out.println(sb);
        br.close();
    }
}