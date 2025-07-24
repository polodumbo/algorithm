import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] arr = new char[N][N];
        for (char[] chars : arr) {
            Arrays.fill(chars, '.');
        }

        char[] moveArr = br.readLine().toCharArray();
        int x = 0;
        int y = 0;
        for (char move : moveArr) {
            switch (move) {
                case 'U':
                    if (x == 0) {
                        break;
                    }
                    arr[x][y] = arr[x][y] == '-' || arr[x][y] == '+' ? '+' : '|';
                    x--;
                    arr[x][y] = arr[x][y] == '-' || arr[x][y] == '+' ? '+' : '|';
                    break;
                case 'D':
                    if (x == N - 1) {
                        break;
                    }
                    arr[x][y] = arr[x][y] == '-' || arr[x][y] == '+' ? '+' : '|';
                    x++;
                    arr[x][y] = arr[x][y] == '-' || arr[x][y] == '+' ? '+' : '|';
                    break;
                case 'L':
                    if (y == 0) {
                        break;
                    }
                    arr[x][y] = arr[x][y] == '|' || arr[x][y] == '+' ? '+' : '-';
                    y--;
                    arr[x][y] = arr[x][y] == '|' || arr[x][y] == '+' ? '+' : '-';
                    break;
                case 'R':
                    if (y == N - 1) {
                        break;
                    }
                    arr[x][y] = arr[x][y] == '|' || arr[x][y] == '+' ? '+' : '-';
                    y++;
                    arr[x][y] = arr[x][y] == '|' || arr[x][y] == '+' ? '+' : '-';
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char[] chars : arr) {
            for (char c : chars) {
                sb.append(c);
            }
            sb.append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}