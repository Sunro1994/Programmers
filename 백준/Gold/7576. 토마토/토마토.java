import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int M;
    static int N;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] field;
    static int tomato = 0;
    static int result = 0;
    static Queue<int[]> queue = new LinkedList<int[]>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        field = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                field[i][j] = Integer.parseInt(st.nextToken());
                if (field[i][j] == 1) queue.offer(new int[]{i, j});
                if (field[i][j] == 0) tomato++;
            }
        }

        while (tomato != 0 && queue.size() > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curPos = queue.poll();
                int r = curPos[0];
                int c = curPos[1];

                for (int j = 0; j < 4; j++) {
                    int nr = r + dx[j];
                    int nc = c + dy[j];

                    if (nr >= 0 && nr < N && nc >= 0 && nc < M && field[nr][nc] == 0) {
                        tomato--;
                        field[nr][nc] = 1;
                        queue.offer(new int[]{nr, nc});
                    }
                }
            }
            result++;
        }

        if (tomato != 0) result = -1;
        System.out.println(result);

    }
}
