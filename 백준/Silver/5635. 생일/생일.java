import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            studentList.add(new Student(st.nextToken(), Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.year == o2.year) {
                    if (o1.month == o2.month) {
                        return o2.day - o1.day;
                    }
                    return o2.month - o1.month;
                }
                return o2.year - o1.year;
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(studentList.get(0).name).append('\n')
            .append(studentList.get(studentList.size() - 1).name);
        System.out.println(sb);
        br.close();
    }

    public static class Student {

        String name;
        int day;
        int month;
        int year;

        public Student(String name, int day, int month, int year) {
            this.name = name;
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

}