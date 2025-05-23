# 1일1알고리즘

[\[Bronze Ⅰ\] 9506. 약수들의 합](./Baekjoon/Bronze/9506.%20약수들의%20합)

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strbd = new StringBuilder();

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == -1) break;

            List<Integer> divisors = new ArrayList<>();
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    divisors.add(i);
                    sum += i;
                }
            }

            strbd.append(num);
            if (sum == num) {
                strbd.append(" = ");
                for (int i = 0; i < divisors.size(); i++) {
                    strbd.append(divisors.get(i) + " + ");
                }
                strbd.replace(strbd.length() - 3, strbd.length(), "");
            } else {
                strbd.append(" is NOT perfect.");
            }
            strbd.append("\n");
        }

        System.out.println(strbd);
        br.close();
    }
}
```

[\[Bronze Ⅲ\] 2501. 약수 구하기](./Baekjoon/Bronze/2501.%20약수%20구하기)

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strtk = new StringTokenizer(br.readLine(), " ");

        int num1 = Integer.parseInt(strtk.nextToken());
        int num2 = Integer.parseInt(strtk.nextToken());
        int count = 0, result = 0;

        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                count++;
            }

            if (count == num2) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
```

[\[Bronze Ⅰ\] 2869. 달팽이는 올라가고 싶다](./Baekjoon/Bronze/2869.%20달팽이는%20올라가고%20싶다)

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strtk = new StringTokenizer(br.readLine(), " ");

        int nClimb = Integer.parseInt(strtk.nextToken());
        int nFall = Integer.parseInt(strtk.nextToken());
        int nTop = Integer.parseInt(strtk.nextToken());

        br.close();

        int nDay = (nTop - nFall) / (nClimb - nFall);

        if ((nTop - nFall) % (nClimb -nFall) != 0) {
            nDay++;
        }

        System.out.println(nDay);
    }
}
```

[\[Silver Ⅴ\] 2563. 색종이](./Baekjoon/Silver/2563.%20색종이)

```java
import java.util.Scanner;

public class BOJ2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] whites = new boolean[100][100];
        int paperCount = sc.nextInt();
        int area = 0;

        for (int i = 0; i < paperCount; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!whites[j][k]) {
                        whites[j][k] = true;
                        area++;
                    }
                }
            }
        }

        System.out.println(area);
    }
}
```

[\[Bronze Ⅰ\] 10798. 세로읽기](./Baekjoon/Bronze/10798.%20세로읽기)

```java
import java.util.Scanner;

public class BOJ10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] cs = new char[5][15];
        int max = 0;

        for (int i = 0; i < cs.length; i++) {
            String str = sc.next();

            if (str.length() > max) {
                max = str.length();
            }

            for (int j = 0; j < str.length(); j++) {
                cs[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < cs.length; j++) {
                if (cs[j][i] == '\0') {
                    continue;
                }
                System.out.print(cs[j][i]);
            }
        }
    }
}
```

---

### [백준]

[1157](./Baekjoon/Bronze/1157.%20단어%20공부)
[1546](./Baekjoon/Bronze/1546.%20평균)
[2501](./Baekjoon/Bronze/2501.%20약수%20구하기)
[2525](./Baekjoon/Bronze/2525.%20오븐%20시계)
[2562](./Baekjoon/Bronze/2562.%20최댓값)
[2563](./Baekjoon/Silver/2563.%20색종이)
[2869](./Baekjoon/Bronze/2869.%20달팽이는%20올라가고%20싶다)
[2884](./Baekjoon/Bronze/2884.%20알람%20시계)
[9506](./Baekjoon/Bronze/9506.%20약수들의%20합)
[10798](./Baekjoon/Bronze/10798.%20세로읽기)
[10809](./Baekjoon/Bronze/10809.%20알파벳%20찾기)
[10869](./Baekjoon/Bronze/10869.%20사칙연산)
