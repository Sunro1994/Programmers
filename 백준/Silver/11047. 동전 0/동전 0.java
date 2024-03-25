import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
    * 1. 오름차순으로 주어진 금액중 K원보다 많은 수가 입력될경우 break
    * 2. 최대값을 반복해서 더한 후 목표값에서 나눈다. 반복할때마다 cnt증가
    * 3.  나머지가 있을 경우 그다음 큰값에서 2번을 반복
    * 4. 목표값이 0이 될때까지 수행한다.
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if(x<=K){
            list.add(x);
            }
        }
        list.sort(Collections.reverseOrder());

        int result = findMinCnt(list,K);
        System.out.print(result);
    }

    private static int findMinCnt(List<Integer> list, int k) {
        int cnt =0;
        int idx =0;
        while (k > 0) {

            cnt += k/list.get(idx);
            k = k % list.get(idx);
            idx ++;
        }

        return cnt;
    }
}
