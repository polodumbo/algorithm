import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        char[][] cookie = new char[N][N];
        int heartRow = 0;
        int heartCol = 0;

        // 머리
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                char c = str.charAt(j);
                if (heartRow == 0 && c == '*') {
                    heartRow = i + 1;
                    heartCol = j;
                }
                cookie[i][j] = c;
            }
        }

        int leftArm = 0;
        int rightArm = 0;
        int body = 0;
        int hipRow = 0;
        int hipCol = heartCol;
        int leftLeg = 0;
        int rightLeg = 0;

        // 왼팔
        for (int i = 0; i < heartCol; i++) {
            char c = cookie[heartRow][i];

            if (c == '*') {
                leftArm = heartCol - i;
                break;
            }
        }

        // 오른팔
        for (int i = heartCol; i < N; i++) {
            char c = cookie[heartRow][i];

            if (c == '_') {
                rightArm = i - heartCol - 1;
                break;
            }
        }

        if (rightArm == 0) {
            rightArm = N - heartCol - 1;
        }

        // 몸
        for (int i = heartRow; i < N; i++) {
            char c = cookie[i][heartCol];

            if (body == 0 && c == '_') {
                hipRow = i - 1;
                body = hipRow - heartRow;
            }
        }

        // 왼다리
        for (int i = hipRow + 1; i < N; i++) {
            char c = cookie[i][hipCol - 1];

            if (leftLeg == 0 && c == '_') {
                leftLeg = i - hipRow - 1;
            }
        }

        if (leftLeg == 0) {
            leftLeg = N - hipRow - 1;
        }

        // 오른다리
        for (int i = hipRow + 1; i < N; i++) {
            char c = cookie[i][hipCol + 1];

            if (rightLeg == 0 && c == '_') {
                rightLeg = i - hipRow - 1;
            }
        }

        if (rightLeg == 0) {
            rightLeg = N - hipRow - 1;
        }

        sb.append(heartRow + 1).append(' ').append(hipCol + 1).append('\n');
        sb.append(leftArm).append(' ');
        sb.append(rightArm).append(' ');
        sb.append(body).append(' ');
        sb.append(leftLeg).append(' ');
        sb.append(rightLeg);

        System.out.println(sb);
        br.close();
    }
}