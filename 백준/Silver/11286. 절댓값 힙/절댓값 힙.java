import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            N 최대 10만개
            x 의범위는 Int범위
            x == 0 절대값이 가장 작은 값을 출력, 같은 값일 경우 더 작은 수 출력
            -5 -2 -1  2 3
            << 비어있으면 0출력
            << 절대값중 가장 작은 -1 poll
            << 절대값중 가장 작은 -2 poll
            << 절댁밧중 가장 작은 2 poll
            << 절대값중 가장 작은 3 poll
            << "" 가장 작은 -5출력
            x != 0 x값을 추가

            N, PriortyQueue pq객체 생성

            N초기화
            for(i초기사, N만큼 반복, i++){
                if(i가 0){
                    가장 작은 값 출력
                }
                else{
                    pq에 삽입(
                    삽입 할 때 정렬 기준이 필요
                    두 값을 비교해서 절대값이 더 작은 수가 앞으로
                    두 값이 같으면 더 작은 수를 앞으로

                    )
                }
            }


         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        int first = Math.abs(o1);
                        int last = Math.abs(o2);
                        if(first != last){
                        return first - last;
                        } else if(first==last) {
                            return o1 -o2;
                        }
                        return -1;
                    }
                }
        );

        for (int i = 0; i < N; i++) {
            int x =sc.nextInt();
            if (x == 0 && !pq.isEmpty()) {
                System.out.println(pq.poll());
            } else if (x == 0 && pq.isEmpty()) {
                System.out.println(0);
            }else{
                pq.offer(x);
            }
        }
    }
}
