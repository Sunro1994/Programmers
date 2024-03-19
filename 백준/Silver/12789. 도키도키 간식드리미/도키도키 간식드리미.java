import java.util.*;

public class Main {
    static int N;
    static Queue<Integer> list ;
    static Stack<Integer> st ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         *   현재 줄 서있는곳  (Queue)
         *    한 명씩 서 있을 수 있는 곳 (Stack)
         *
         *   1. 현재 줄 서 있는곳의 인원을 모두 빼서 1부터 차례대로 입장
         *   2. 순서가 아닌 사람들은 Stack으로 이동
         *   3. Stack에서 순서대로 입장(순서대로 입장이 안되면 Sad)
         * */

        N = sc.nextInt();
        list = new LinkedList<>();
        st = new Stack<>();



        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int idx = 1;
        while (list.size() != 0) {
            if(list.peek()==idx) {
                list.poll();
                idx++;
                
            }else if(!st.isEmpty() && st.peek() == idx){
                st.pop();
                idx++;
            }
            
            else {
                st.push(list.poll());
            }
        }

        while (!st.isEmpty()) {
            if (st.peek() == idx) {
                st.pop();
                idx++;
            }
            else{
                break;
            }
        }

        System.out.println(st.isEmpty()?"Nice" : "Sad");

    }
}
