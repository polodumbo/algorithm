import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb;
    static int N;
    static char character = '@';

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        sb = new StringBuilder();

        addLine(' ', 3);
        addLine(' ', 2);
        addLine('@', 1);
        addLine(' ', 2);
        addLine(' ', 3);

        System.out.println(sb);
        br.close();
    }

    public static void addLine(char middleCharacter, int number) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(character);
            }

            for (int j = 0; j < N * number; j++) {
                sb.append(middleCharacter);
            }

            for (int j = 0; j < N; j++) {
                sb.append(character);
            }
            sb.append('\n');
        }
    }
}