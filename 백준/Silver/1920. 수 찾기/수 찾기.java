import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int M, N;
    static List<Integer> arr;
    static int pl; // Remove initialization here
    static int pr; // Remove initialization here

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //배열의 길이 입력
        M = sc.nextInt();
        //M만큼 배열의 길이 생성
        arr = new ArrayList<>(M);
        //배열의 길이만큼 반복문으로 배열 채우기
        for (int i = 0; i < M; i++) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);

        //비교할 배열의 길이 생성
        N = sc.nextInt();

        // Initialize pl and pr after M is inputted

        for (int i = 0; i < N; i++) {
            int target = sc.nextInt();
            boolean find = false;
            int start =0;
            int end = arr.size() - 1;
            while(start <= end){
                int mid = (start+end)/2;
                int mid_value = arr.get(mid);
                if(mid_value > target){
                    end = mid-1;
                }else if(mid_value < target){
                    start = mid+1;
                }else{
                    find = true;
                    break;
                }
            }
            if(find){
                System.out.println(1);
            }else {
                System.out.println(0);
            }

        }
    }
}
