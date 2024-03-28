import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Main {

    //방문 배열
    static boolean[] visited;
    //거리 계산
    static int[] dist;

    //인접 리스트
    static List<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //전체사람수
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        visited = new boolean[N + 1];
        dist = new int[N + 1];
        for (int i = 0; i < N+1; i++) {
            list.add(new ArrayList<>());
        }


        //계산할 촌수
        int p1 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        //엣지 수
        int edge = Integer.parseInt(st.nextToken());

        for (int i = 0; i < edge; i++) {
        st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.get(x).add(y);
            list.get(y).add(x);
        }

        int result = findDistnace(p1, p2);

        System.out.println(result);






    }

    private static int findDistnace(int p1, int p2) {
        Queue<Integer> que = new LinkedList<>();
        dist[p1] =0;
        visited[p1] = true;

        que.offer(p1);
        while (!que.isEmpty()) {
            int cur = que.poll();
            for (int next : list.get(cur)) {
                if (!visited[next]) {
                    dist[next] = dist[cur]+1;
                    if (next == p2) {
                        return dist[next];
                    }
                que.offer(next);
                visited[next] = true;
                }
            }
        }
        return -1;


    }
}
