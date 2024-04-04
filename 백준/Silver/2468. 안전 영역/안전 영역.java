
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] area;
    static boolean[][] visited;
    static int answer = 0;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        area = new int[N][N];
        visited = new boolean[N][N];
        for (int x = 0; x < N; x++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int y = 0; y < N; y++) {
                area[x][y] = Integer.parseInt(st.nextToken());
                max = Math.max(area[x][y], max);
            }
        }
        for (int i = 0; i <= max; i++) { // 최솟값부터 탐색
            visited = new boolean[N][N];
            int safety = 0;
            for (int x = 0; x < N; x++) {
                for (int y = 0; y < N; y++) {
                    if (!visited[x][y] && area[x][y] > i) { // 현재 높이보다 높은 경우에만 안전 영역 탐색
                        findSafeZone(x, y, i);
                        safety++;
                    }
                }
            }
            answer = Math.max(answer, safety);
        }

        System.out.println(answer);
    }

    private static void findSafeZone(int x, int y, int depth) {
        Queue<int[]> que = new LinkedList();
        que.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!que.isEmpty()) {
            int[] now = que.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];
                if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                    if (!visited[nx][ny] && area[nx][ny] > depth) { // 현재 높이보다 높은 경우에만 탐색
                        visited[nx][ny] = true;
                        que.offer(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
