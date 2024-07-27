import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] t, p;
    static int[] dp;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        t = new int[N];
        p = new int[N];
        dp = new int[N + 1];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        // dp[i] = i일까지 얻을 수 있는 최대 수익
        for (int i = 0; i < N; i++) {
            // i일에 작업을 수행하는 경우
            if (i + t[i] <= N) {
                dp[i + t[i]] = Math.max(dp[i + t[i]], dp[i] + p[i]);
            }
            // i일에 작업을 수행하지 않는 경우
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);
        }

        // 최대 수익은 dp 배열에서 가장 큰 값
        int max = 0;
        for (int i = 0; i <= N; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}
