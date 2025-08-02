import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Quiz> pq = new PriorityQueue<>(Comparator.comparingInt(Quiz::getScore).reversed());

        for (int i = 0; i < 8; i++) {
            pq.add(new Quiz(i + 1, Integer.parseInt(br.readLine())));
        }
        
        int sum = 0;
        int[] result = new int[5];
        for (int i = 0; i < 5; i++) {
            Quiz quiz = pq.poll();
            sum += quiz.score;
            result[i] = quiz.index;
        }

        Arrays.sort(result);
        StringBuilder sb = new StringBuilder();
        sb.append(sum).append('\n');
        for (int i : result) {
            sb.append(i).append(' ');
        }
        System.out.println(sb);
        br.close();
    }

    static class Quiz {
        int index;
        int score;

        public Quiz(int index, int score) {
            this.index = index;
            this.score = score;
        }

        public int getScore() {
            return score;
        }
    }
}