import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int X;
    static int sum;
    static PriorityQueue<Integer> pq;
    public static void main(String[] args) throws IOException {


        /*
            1. 10 20 40 60
            30 40 60
            30 70 60
            100 100 60
            10+20 -> 30+40 = 100
            가장 작은 두수를 더하고 다음 작은 두수를 더한다.

            int X, PriorityQue pq 생성
            int sum 생성

            Scanner 객체 생성
            X초기화
            sum초기화
            pq초기화
            for(X만큼 반복){
                pq.offer(입력받음)
            }

            for(X만큼 반복, 간격을 2로 설정){
            sum에 i와 i+1을 합한다.
            }

         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        X = Integer.parseInt(br.readLine());
        pq = new PriorityQueue();

        for (int i = 0; i < X; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        while (pq.size() > 1) {
            int tmp =pq.poll()+pq.poll();
            sum += tmp;
            pq.add(tmp);
        }
        System.out.println(sum);

    }
}
