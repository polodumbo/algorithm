import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] angles = new int[3];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            int angle = Integer.parseInt(br.readLine());
            sum += angle;
            angles[i] = angle;
        }

        if (sum != 180) {
            sb.append("Error");
        } else if (angles[0] == 60 && angles[1] == 60 && angles[2] == 60) {
            sb.append("Equilateral");
        } else if (angles[0] != angles[1] && angles[0] != angles[2] && angles[1] != angles[2]) {
            sb.append("Scalene");
        } else {
            sb.append("Isosceles");
        }

        System.out.println(sb);
        br.close();
    }
}