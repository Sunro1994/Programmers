import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main {
    static int N; // 센서의 개수
    static int K; // 집중국의 개수
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //1. 입력
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());

        if (K >= N) {
            System.out.println(0);
            return;
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        //2. 센서간의 거리
        int[] sensorArr = new int[N];
        for (int i = 0; i < N; i++) {
            sensorArr[i] = Integer.parseInt(st.nextToken());
        }

        //3. 정렬
        Arrays.sort(sensorArr);

        //4. 센서 거리 차이를 담은 배열 생성
        Integer[] diffLength = new Integer[N - 1];
        for (int i = 0; i < N - 1; i++) {
            diffLength[i] = sensorArr[i + 1] - sensorArr[i];
        }

        //4. 정렬
        Arrays.sort(diffLength, Collections.reverseOrder());

      
        //5. 차이 배열의 k-1 부터 마지막까지 출력
        for (int i = K - 1; i < N - 1; i++) {
            result += diffLength[i];
        }

        System.out.println(result);

    }
}
