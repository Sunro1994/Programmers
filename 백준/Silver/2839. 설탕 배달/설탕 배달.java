import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        System.out.println(sovle(n));



    }

    private static int sovle(int n) {
        int min = Integer.MAX_VALUE;



        //1. 3또는 5로 나누어 떨어질때
        if (n % 3==0 && n%5 ==0 ) {
            min = Math.min(n/ 3, n /5);
        }
            //2. 3으로만 떨어질때
        if (n % 3 == 0) {
            min = Math.min(min,n/3);
        }
        //3. 5로만 떨어질 때
        if (n % 5 == 0) {
            min = Math.min(min,n/5);
        }
        //4. 5로 나눠지고 나머지가 3의 배수일때
        if (n % 5 > 0) {
            int cnt =0;
            while (n > 5) {
                n -= 5;
                cnt++;
                if (n % 3 == 0) {
                    min = Math.min(min,n/3  + cnt);
                }
            }
        }


        return min==Integer.MAX_VALUE? -1 : min;
    }
}
