import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            studentList.add(new Student(st.nextToken(), st.nextToken(), st.nextToken()));
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            String fruit = st.nextToken();
            String color = st.nextToken();

            int count = 0;
            for (int j = 0; j < n; j++) {
                Student student = studentList.get(j);
                if (student.isMatched(subject, fruit, color)) {
                    count++;
                }
            }
            sb.append(count).append('\n');
        }

        System.out.println(sb);
        br.close();
    }

    public static class Student {

        public String subject;
        public String fruit;
        public String color;

        public Student(String subject, String fruit, String color) {
            this.subject = subject;
            this.fruit = fruit;
            this.color = color;
        }

        public boolean isMatched(String subject, String fruit, String color) {
            return (subject.equals("-") || subject.equals(this.subject)) &&
                (fruit.equals("-") || fruit.equals(this.fruit)) &&
                (color.equals("-") || color.equals(this.color));
        }
    }
}