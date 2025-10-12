import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine()); // 수강생 수
            int[] marathonerArr = new int[K];
            StringTokenizer st = new StringTokenizer(br.readLine()); // 수강생 번호

            for (int j = 0; j < K; j++) {
                int number = Integer.parseInt(st.nextToken());
                marathonerArr[j] = number;
            }
            Arrays.sort(marathonerArr);

            int N = Integer.parseInt(br.readLine()); // 참가자 수
            int count = 0;
            Marathoner top = new Marathoner();

            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine()); // 참가자 기록
                int number = Integer.parseInt(st.nextToken());
                int hour = Integer.parseInt(st.nextToken());
                int minute = Integer.parseInt(st.nextToken());

                int index = Arrays.binarySearch(marathonerArr, number);
                if (index > -1 && hour > -1) {
                    minute = hour * 60 + minute;
                    if (minute <= 360) { // 인증서
                        count++;
                    }
                    if (minute < top.getMinute()) {
                        top = new Marathoner(number, minute);
                    }
                }
            }
            sb.append(top.getNumber()).append(' ').append(count).append('\n');
        }

        System.out.println(sb);
        br.close();
    }

    public static class Marathoner {

        private int number;
        private int minute;

        public Marathoner() {
            this.minute = Integer.MAX_VALUE;
        }

        public Marathoner(int number, int minute) {
            this.number = number;
            this.minute = minute;
        }

        public int getNumber() {
            return this.number;
        }

        public int getMinute() {
            return this.minute;
        }
    }
}