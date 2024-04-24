import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static int n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();


        String answer = solve(n);
        System.out.println(answer);
    }

    private static String solve(int target) {
    //1 ->1
    //2,3-> 2
    //4,5,6 -> 3
    //7,8,9,10 -> 4
    //11,12,13,14,15 -> 5
    //16,17,18,19,20,21 -> 6
        int line=0;
        int sum=0;
        for (int i = 1; true; i++) {
            if (target > i) {
                target -= i;
                sum +=i;
            }else{
                line = i;
                break;
            }
        }
//        System.out.println("sum = " + sum);
//        System.out.println("line = " + line);
        int interval = n-sum-1;

//        System.out.println("interval = " + interval);

    //라인은 구했으나 몇번 반복문에 대한 횟수를 제시할 수 있는 힌트가 부족

        int 분자;
        int 분모;
        if (line % 2==0) {
            분자=1;
            분모=line;
            for (int i = 0; i < interval; i++) {
                분자++;
                분모--;
            }

        }else{
            분자=line;
            분모=1;
            for (int i = 0; i < interval; i++) {
                분자--;
                분모++;
            }

        }


        return 분자+"/"+분모;
    }
}
