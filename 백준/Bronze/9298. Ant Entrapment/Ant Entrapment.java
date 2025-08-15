import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            double xMin = Integer.MAX_VALUE;
            double xMax = Integer.MIN_VALUE;
            double yMin = Integer.MAX_VALUE;
            double yMax = Integer.MIN_VALUE;

            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                double x = Double.parseDouble(st.nextToken());
                double y = Double.parseDouble(st.nextToken());

                if (x < xMin) xMin = x;
                if (x > xMax) xMax = x;
                if (y < yMin) yMin = y;
                if (y > yMax) yMax = y;
            }

            double area = (xMax - xMin) * (yMax - yMin);
            double perimeter = (xMax - xMin + yMax - yMin) * 2;

            sb.append("Case ").append(i + 1)
                    .append(": Area ").append(area)
                    .append(", Perimeter ").append(perimeter)
                    .append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}