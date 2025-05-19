# 1일1알고리즘

25.05.19. [\[Bronze Ⅰ\] 1157. 단어 공부](./Baekjoon/Bronze/1157.%20단어%20공부)

```java
import java.util.Scanner;

public class BOJ1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] nums = new int[26];
        char c = ' ';

        for (int i = 0; i < S.length(); i++) {
            c = S.charAt(i);
            if (c >= 65 && c <= 90) {
                nums[c - 'A']++;
            } else {
                nums[c - 'a']++;
            }
        }

        int max = -1;

        for (int i = 0; i < 26; i++) {
            if (nums[i] > max) {
                max = nums[i];
                c = (char) (i + 65);
            } else if (nums[i] == max) {
                c = '?';
            }
        }

        System.out.println(c);

    }
}
```

25.05.18. [\[Bronze Ⅱ\] 10809. 알파벳 찾기](./Baekjoon/Bronze/10809.%20알파벳%20찾기)

```java
import java.util.Scanner;

public class BOJ10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] nums = new int[26];
        char c = ' ';

        for (int i = 0; i < 26; i++) {
            nums[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            c = S.charAt(i);
            if (nums[c - 'a'] == -1) {
                nums[c - 'a'] = i;
            }
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
```

25.05.17. [\[Bronze Ⅰ\] 1546. 평균](./Baekjoon/Bronze/1546.%20평균)

```java
import java.util.Scanner;

public class BOJ1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[sc.nextInt()];
        double max = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();

            if (max < nums[i]) {
                max = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] / max * 100;
        }

        System.out.println(sum / nums.length);
    }
}
```

25.05.16. [\[Bronze Ⅲ\] 2562. 최댓값](./Baekjoon/Bronze/2562.%20최댓값)

```java
import java.util.Scanner;

public class BOJ2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[9];
        int max = 0, index = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }

        System.out.printf("%d\n%d", max, index + 1);
    }
}
```

25.05.15. [\[Bronze Ⅲ\] 2525. 오븐 시계](./Baekjoon/Bronze/2525.%20오븐%20시계)

```java
import java.util.Scanner;

public class BOJ2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), m = sc.nextInt(), t = sc.nextInt();

		h += t / 60;
		m += t % 60;

		if (m >= 60) {
			h++;
			m -= 60;
		}

		if (h >= 24) {
			h -= 24;
		}

		System.out.printf("%d %d", h, m);
	}
}
```

25.05.14. [\[Bronze Ⅲ\] 2884. 알람 시계](./Baekjoon/Bronze/2884.%20알람%20시계)

```java
import java.util.Scanner;

public class BOJ2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), m= sc.nextInt();

		if (m - 45 < 0) {
			h--;
			m += 15;
		} else {
			m -= 45;
		}

		if (h < 0) {
			h = 23;
		}

		System.out.printf("%d %d", h, m);
	}
}
```

---

### [백준]

[1157](./Baekjoon/Bronze/1157.%20단어%20공부)
[1546](./Baekjoon/Bronze/1546.%20평균)
[2525](./Baekjoon/Bronze/2525.%20오븐%20시계)
[2562](./Baekjoon/Bronze/2562.%20최댓값)
[2884](./Baekjoon/Bronze/2884.%20알람%20시계)
[10809](./Baekjoon/Bronze/10809.%20알파벳%20찾기)
[10869](./Baekjoon/Bronze/10869.%20사칙연산)
