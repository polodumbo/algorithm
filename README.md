# 1일1알고리즘

25.05.15. [\[Bronze Ⅲ\] 오븐 시계 - 2525](./Baekjoon/Bronze/2525.%20오븐%20시계)

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

25.05.14. [\[Bronze Ⅲ\] 알람 시계 - 2884](./Baekjoon/Bronze/2884.%20알람%20시계)

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

25.05.13. [\[Bronze Ⅴ\] 사칙연산 - 10869](./Baekjoon/Bronze/10869.%20사칙연산)

```java
import java.util.Scanner;

public class BOJ10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b= sc.nextInt();
        System.out.printf("%d %d %d %d %d", a + b, a - b, a * b, a / b, a % b);
    }
}
```

---

### [백준]

[2525](./Baekjoon/Bronze/2525.%20오븐%20시계)
[2884](./Baekjoon/Bronze/2884.%20알람%20시계)
[10869](./Baekjoon/Bronze/10869.%20사칙연산)
