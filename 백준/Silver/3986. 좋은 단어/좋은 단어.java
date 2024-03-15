import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int N;
    static String target;
    static int cnt;
    static Stack<Character> st = new Stack<>();
    public static void main(String[] args) {
        /*
        *  알파벳이 교차되면 틀린 답
        * 짝을 짓고 있어야 한다.
        * 홀수이면 안된다.
        *
        * 슈도코드작성
        * int N, String target, int cnt
        * stack st
        *
        * N초기화
        * cnt초기화
        * st초기화
        *
        * for(N만큼 반복){
        *   target초기화
        *   target을 판단하는 메서드(target)
        * }
        *
        *
        * target을 판단하는 메서드(target){
        *   첫 글자를 stack에 넣는다.
        *
        * for(target 의 1번째 인덱스부터 ~target의 마지막인덱스까지){
        *
        *    if(!stack.empty &&target의 i번째 인덱스가 stack의 peek과 같으면){
        *       stack.pop()
        *       count++
        * }else if (stack.empty) {
        *     stack.push(i번째 인덱스)
        * }else  {
        *       stack.push(target의 i번째인덱스)
        *    }
        *
        *
        * }
        * }
        * */



        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            target = sc.next();
            if(target.length()%2 ==0){
           isGoodWord(target);

            }
        }

        System.out.println(cnt);



    }

    private static void isGoodWord(String target) {
        st.add(target.charAt(0));
        for (int i = 1; i <target.length() ; i++) {
            if(!st.empty() && st.peek()==target.charAt(i) ){
                st.pop();
            } else if (st.empty()) {
                st.push(target.charAt(i));
            }else{
                st.push(target.charAt(i));
            }
        }
        if(st.empty()) cnt++;
        st.clear();
    }
}
