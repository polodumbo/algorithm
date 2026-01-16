import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        sb = new StringBuilder();

        drawAt();

        System.out.println(sb);
        br.close();
    }

    static void drawAt() {
        drawLine();
        for (int i = 0; i < N; i++) {
            drawMiddle();
        }
        drawLine();
    }

    static void drawLine() {
        for (int i = 0; i < N + 2; i++) {
            sb.append('@');
        }
        sb.append('\n');
    }

    static void drawMiddle() {
        sb.append('@');
        for (int i = 0; i < N; i++) {
            sb.append(' ');
        }
        sb.append('@');
        sb.append('\n');
    }
}