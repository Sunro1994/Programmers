import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
static int[] result;
static int cnt = 1;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        A = new ArrayList[n+1];
        visited = new boolean[n+1];
        result = new int[n + 1];




        for (int i = 1; i < n + 1; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        int cnt = 0;
        if (!visited[v]) {
            DFS(v);
        }
        for (int i = 1; i < n+1; i++) {
            System.out.println(result[i]);
        }

    }

    private static void DFS(int v) {
        if(visited[v]) return;

        visited[v] = true;
        result[v] = cnt++;
        Collections.sort(A[v], Collections.reverseOrder());
        for (Integer i : A[v]) {
            if (!visited[i]) {
                DFS(i);
            }
        }

    }
}
