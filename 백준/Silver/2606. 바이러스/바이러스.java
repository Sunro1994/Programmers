import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int M;
    static boolean visited[];
    static List<Integer>[] list;
    static int answer;
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());

       N = Integer.parseInt(st.nextToken());

       st = new StringTokenizer(br.readLine());

       M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        list = new ArrayList[N + 1];

        for (int i = 0; i < N + 1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            list[start].add(end);
            list[end].add(start);
        }

        isVisited(1);

        for(int i=0; i<N+1 ; i++){
            if(visited[i]) answer++;
        }
        System.out.println(answer-1);


    }
        public static void isVisited(int i){
            if(visited[i]) return;
            visited[i] = true;

            for (int x : list[i]) {
                if(!visited[x]) isVisited(x);
            }
        }
}
