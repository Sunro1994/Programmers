import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static int N;
    public static void main(String[] args) {
        /*

        N=2 [1,50] = 4
        N=3 [1, 10 , 50]

        1. 정렬
        2. 연속된 5개의 숫자이므로 1이면 5까지 x ... x+4까지의 범위가 있어야한다.
        3. a에서 4칸 뒤 인덱스의 숫자를 뺐을때 0인경우:
             0출력
        3-1. 다른 방법, [1,2,3,4,5]의 배열이라면 [1,1,1,1,0]
        [1,4,8,11,50,79,80]의 배열이라면 [3,4,3,29,1,0]
        [1,2,4,8,11,60,79,80,81]
        [1,90,111]
        [1,2,5,6,8,9,90,91,92,93,99,100,101,102,103,104]




         */
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        List<Integer> arr = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            arr.add(i,x);
        }
        arr.sort((o1, o2) -> o1-o2);

        //정답 변수
        int max_cnt =0;
        //시작 인덱스
        int start = arr.get(0);
        //target인덱스
        int idx =1;

        int next_idx=2;
        int cnt=0;

        while(max_cnt!=5){
            if(idx==N) break;
            //조건성립시 해당 내용 반복
            if (arr.get(idx) - start<=4) {
                cnt++;
                idx++;
            }
            //조건불충족시 다음 인덱스로 변경
            else {
                start = arr.get(next_idx-1);
                idx= next_idx;

                next_idx++;
                cnt=0;
            }
                max_cnt = Math.max(max_cnt, cnt);

        }


        System.out.println((4-max_cnt));

    }
}
