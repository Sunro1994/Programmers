import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
   
    static int[][] arr;
    static boolean[][] visited;
    static int N;
    static int[] dx = {0,1,-1,0};
    static int[] dy = {1,0,0,-1};
    static ArrayList<Integer> list = new ArrayList<>();
    static int flag =1;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        visited = new boolean[N][N];
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(str.substring(j, j + 1));
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    BFS(i,j);
                    list.add(flag);
                    flag =1;
                }

            }

        }

        Collections.sort(list);

        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }



    }

    private static void BFS(int x, int y) {
      visited[x][y]=true;

        for (int i = 0; i < 4; i++) {
            int nx = dx[i]+x;
            int ny = dy[i]+y;

            if (nx >= 0 && ny >= 0&&nx<N && ny<N) {
                if (!visited[nx][ny] && arr[nx][ny] == 1) {
                    flag++;
                    BFS(nx, ny);
                }
            }
        }
    }
}
