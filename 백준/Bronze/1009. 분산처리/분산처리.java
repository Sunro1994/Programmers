import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int answer2 = solve2(x, y);
        System.out.println(answer2==0 ? 10 : answer2);
        }


    }

    private static int solve(int x, int y) {
        BigInteger bi1 = new BigInteger(String.valueOf(x));

        BigInteger pow = bi1.pow(y);
        String answerStr = String.valueOf(pow);
        int answer = Integer.parseInt(answerStr.substring(answerStr.length() - 1));

        return answer;



    }

    private static int solve2(int x, int y) {
        int r =1;
        for (int i = 0; i < y; i++) {
            r = (r*x)%10;
        }

        return r;
    }
}
