import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 각 요소들중 2번쨰로 큰 최대 중량의 값으로 N-1 *2
 * 각 요소들중 3번째로 큰 최대 중량의 값으로 N-2 *3
 * 그러면 0번째것 * 총 개수
 * 1번째것 * 총 개수 -1
 * 2번재 것 * 총 개수 -2
 */
public class Main {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //1. 입력
        N = Integer.parseInt(br.readLine());

       Integer[] maxDurableWeight = new Integer[N];

        for (int i = 0; i < N; i++) {
            maxDurableWeight[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(maxDurableWeight, Collections.reverseOrder());

        int result=0;

        for (int i = 0; i < N; i++) {
            result = Math.max(result, maxDurableWeight[i] * (i + 1));
        }
        System.out.println(result);

        }

}
