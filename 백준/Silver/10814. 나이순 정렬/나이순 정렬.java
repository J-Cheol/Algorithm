import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    private static class Member {
        final int idx;
        final int age;
        final String name;
        Member(int idx, int age, String name) {
            this.idx = idx;
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Member[] arr = new Member[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age   = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            arr[i] = new Member(i, age, name);
        }

        Arrays.sort(arr, Comparator
                     .comparingInt((Member m) -> m.age)
                     .thenComparingInt(m -> m.idx));

        StringBuilder sb = new StringBuilder(N * 8);
        for (Member m : arr) sb.append(m.age).append(' ').append(m.name).append('\n');
        System.out.print(sb);
    }
}
