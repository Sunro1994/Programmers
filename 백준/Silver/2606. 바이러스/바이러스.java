import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static boolean visited[];
    static List<Integer>[] list;
    public static void main(String[] args) throws IOException {
        /*
        N = 컴퓨터수 (100이하)
        M = 엣지 수
        visited[] 방문 배열
        List<>[] 인접 리스트
        1번과 연결된 노드를 담을 리스트
        cnt

        각 필드 초기화


        for(N만큼 반복){
            인접 리스트[i] 초기화
        }

        for(M만큼 반복){
            인접 리스트 작성(쌍으로 연결)
        }


        DFS(1)수행

         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        st= new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        list = new ArrayList[N+1];

        for (int i = 0; i < N+1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list[start].add(end);
            list[end].add(start);
        }

        DFS(1);

        int cnt=0;
        for (int i = 1; i < N+1; i++) {
            if(visited[i]) cnt++;

        }
        System.out.println(cnt-1);


    }

    private static void DFS(int i) {
        if(visited[i]) return;
        visited[i] = true;

        for(int x : list[i]){
            if(!visited[x]) DFS(x);
        }

    }
}
