import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    //방문 배열
    static boolean[] visited;
    //인접 리스트
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //노드의 개수
        int n = Integer.parseInt(st.nextToken());
        //에지의 개수
        int m = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1];
        A = new ArrayList[n + 1];
        for (int i = 1; i < n + 1; i++) {
            //인접리스트배열 초기화
            A[i] = new ArrayList<Integer>();
        }
        //인접 리스트에 그래프 데이터 저장
        for (int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        //개수를 판단할 count변수
        int count =0;
        //방문배열에 등록되지 않은 노드를 재귀함수를 통해 찾아냄
        for (int i = 1; i <n+1; i++) {
            if(!visited[i]) {
                count++;
                DFS(i);
            }
        }
        System.out.println(count);

    }

    private static void DFS(int v) {
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for (int i : A[v]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
}
