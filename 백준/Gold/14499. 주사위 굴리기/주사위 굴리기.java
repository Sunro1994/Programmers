import java.io.*;
import java.util.*;

/*
    N,M,X,Y,K가 주어짐
    N,M은 지도의 크기
    X,Y는 주사위의 좌표
    K는 명령횟수

    둘째줄부터 N개의 줄에 지도에 쓰여있는 수가 북쪽부터 남쪽으로, 각 줄은 서쪽에서 동쪽으로 주어짐
    [반복문을 통해 지도의 칸 별 값 지정)

    명령을 통해 이동시킴
    - 체크해야 할 것
    1. 이동할 곳이 지도 밖인가?
    2. 이동후에 윗면 출력하기
    3. 이동한 칸의 값이 0인가 아닌가?
    3-1. 이동한 칸이 0이면 주사위 바닥면에 있는 수가 칸에 복사
    3-2. 이동한 칸이 0이 아니면 칸에 있는 수가 주사위 바닥면에 복사, 칸은 0이됨


    0
  0 3 0
    0
    0

    0 2
    3 4
    5 6
    7 8


 */
public class Main {
        public static int n,m,x,y,k;
        public static int[][] map;

        //동,서,북,남
        public static int[] dx = {0,0,-1,1};
        public static int[] dy = {1, -1, 0, 0};

        //윗,바,앞,뒤,왼,오
        public static int[] dice = {0, 0, 0, 0, 0, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        x =Integer.parseInt(st.nextToken());
        y= Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            int move = Integer.parseInt(st.nextToken())-1;
            x += dx[move];
            y += dy[move];
            if (x < 0 || x >= n || y < 0 || y >= m) {
                x -=dx[move];
                y -= dy[move];
                continue;
            }

            switch (move) {
                case 0:
                    move_right();
                    break;
                case 1:
                    move_left();
                    break;
                case 2:
                    move_up();
                    break;
                case 3:
                    move_down();
                    break;
            }

            //바닥면 복사
            if (map[x][y] == 0) {
                map[x][y] = dice[1];
            }else{
                dice[1] = map[x][y];
                map[x][y] = 0;
            }

            System.out.println(dice[0]);

        }
    }

    private static void move_down() {
        // 윗 -> 앞 -> 바 -> 뒷 -> 윗
        int temp = dice[0];
        dice[0] = dice[3];
        dice[3] = dice[1];
        dice[1] = dice[2];
        dice[2] = temp;
    }

    private static void move_up() {
        // 윗 -> 뒷 -> 바 -> 앞 -> 윗
        int temp = dice[0];
        dice[0] = dice[2];
        dice[2] = dice[1];
        dice[1] = dice[3];
        dice[3] = temp;
    }

    private static void move_left() {
        // 윗 -> 왼 -> 바 -> 오 -> 윗
        int temp = dice[0];
        dice[0] = dice[5];
        dice[5] = dice[1];
        dice[1] = dice[4];
        dice[4] = temp;
    }
//    //윗,바,앞,뒤,왼,오
//    public static int[] dice = {0, 0, 0, 0, 0, 0};
    public static void move_right() {
        int temp = dice[0];
        dice[0] = dice[4];
        dice[4] = dice[1];
        dice[1] = dice[5];
        dice[5]  = temp;
    }

}

