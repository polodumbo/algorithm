import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 파일 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] sizeArr = new int[N]; // 각 파일 사이즈 배열
        for (int i = 0; i < sizeArr.length; i++) {
            sizeArr[i] = Integer.parseInt(st.nextToken());
        }
        int cluster = Integer.parseInt(br.readLine()); // 클러스터 사이즈

        long count = 0;
        for (int size : sizeArr) {
            if (size == 0) {
                continue;
            }

            // 파일당 필요한 클러스터 개수
            count += size / cluster;
            if (size % cluster > 0) {
                count++;
            }
        }

        System.out.println(cluster * count);
        br.close();
    }
}