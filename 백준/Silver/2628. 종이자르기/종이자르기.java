import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        List<Integer> wList = new ArrayList<>(Arrays.asList(0, width));
        List<Integer> hList = new ArrayList<>(Arrays.asList(0, height));

        int cut = Integer.parseInt(br.readLine());
        for (int i = 0; i < cut; i++) {
            st = new StringTokenizer(br.readLine());
            int xy = Integer.parseInt(st.nextToken());
            int point = Integer.parseInt(st.nextToken());
            if (xy == 0) {
                hList.add(point);
            } else {
                wList.add(point);
            }
        }

        System.out.println(getMax(wList) * getMax(hList));
        br.close();
    }

    public static int getMax(List<Integer> list) {
        Collections.sort(list);
        int max = 0;
        int pre = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int temp = list.get(i) - pre;
            if (max < temp) {
                max = temp;
            }
            pre = list.get(i);
        }

        return max;
    }
}