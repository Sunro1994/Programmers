import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //값이 10만개가 될 수 있으므로 Scanner보다는 Stringtokenizer를 사용한다.
        //일일이 int형으로 parse하면 메모리낭비가 심하므로

//        Scanner sc = new Scanner(System.in);
//
//        int M = sc.nextInt();
//        int N = sc.nextInt();
//
//        int[] arr = new int[M+1];
//
//        for (int i = 1; i <= M; i++) {
//            if (i == 0) {
//                arr[i] = sc.nextInt();
//            }else {
//                arr[i] = sc.nextInt() + arr[i - 1];
//            }
//        }
//
//
//
//        for (int i = 0; i < N; i++) {
//            int start = sc.nextInt();
//            int end = sc.nextInt();
//            System.out.println(arr[end]-arr[start-1]);
//        }
//    }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int suNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());
        //덧셈이나 곱셈이 많을때는 습관적으로 long[]만들어주는게 좋다.
        long[] S = new long[suNo+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <=suNo; i++) {
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < quizNo; i++) {
        st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            System.out.println(S[end]-S[start-1]);
        }
    }
}
