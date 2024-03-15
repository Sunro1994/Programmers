import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static int N;
    public static void main(String[] args) {
        /*
        * 123456
        * 1버리고 2를 뒤로
        * 34562
        * 3버리고 4를 뒤로
        * 5624
        * 5버리고 6을 뒤로
        * 246
        *
        * 2버리고 4를 뒤로
        * 64
        *
        * 6버리고 4를뒤로
        * 4
        *
        *
        * */

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Deque<Integer> que = new LinkedList();

        for (int i = 1; i <=N; i++) {
            que.add(i);
        }

        while(que.size()!=1){
            int toBack;
            que.pollFirst();
            toBack =  que.pollFirst();
            que.addLast(toBack);
        }

        System.out.println(que.pop());
    }
}
