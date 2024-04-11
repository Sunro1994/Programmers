import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M, R, C, direction;
    static int[][] arr;
    static int cnt = 0;
    // 북, 동, 남, 서
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];

        st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        direction = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        clean(R, C, direction);
        System.out.println(cnt);
    }

    private static void clean(int x, int y, int d) {
        if (arr[x][y] == 0) {
            arr[x][y] = 2; // 청소 완료
            cnt++;
        }

        boolean allCleaned = true;
        int originalDirection = d;
        for (int i = 0; i < 4; i++) {
            int nextDirection = (d + 3) % 4; // 왼쪽 방향
            int nextX = x + dx[nextDirection];
            int nextY = y + dy[nextDirection];

            if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < M && arr[nextX][nextY] == 0) {
                clean(nextX, nextY, nextDirection);
                allCleaned = false;
                break;
            }
            d = nextDirection;
        }

        if (allCleaned) {
            int backDirection = (originalDirection + 2) % 4;
            int backX = x + dx[backDirection];
            int backY = y + dy[backDirection];

            if (backX >= 0 && backX < N && backY >= 0 && backY < M && arr[backX][backY] != 1) {
                clean(backX, backY, originalDirection);
            }
        }
    }
}
