import java.util.*;
import java.io.*;
 
// https://www.acmicpc.net/problem/11920
 
class Main {
    static int stoi(String s) { return Integer.parseInt(s);}
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
 
        st = new StringTokenizer(br.readLine());
        int n = stoi(st.nextToken());
        int k = stoi(st.nextToken());
 
        st = new StringTokenizer(br.readLine());
 
        /**
         * 우선순위 큐에 K개만큼 원소를 계속 유지
         * 제일 작은 값이 들어오면 바로 pop
         * 더 큰값이 들어오면 큐에 남겨두고 기존에 있던 값 중 가장 작은 값 pop (K만큼 돌았을 때 큰값들은 뒤에 정렬되어있기 때문에)
         */
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0; i<n; i++) {
            pq.offer(stoi(st.nextToken()));
            
            if(i >= k)
                bw.write(pq.poll() + " ");
        }
 
        while(!pq.isEmpty())
            bw.write(pq.poll() + " ");
        bw.flush();
    }
}