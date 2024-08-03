import java.util.*;
import java.io.*;

public class Main {
    static int result=0;
    static int N;
    static int[][] sea;
    static List<Fish> feed = new ArrayList<>();
    static  Fish shark = null;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<Fish> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
         sea = new int[N][N];


        for (int i = 0; i < N; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                if (Integer.parseInt(temp[j]) == 9) {
                    shark = new Fish(i, j, 2, 0,0);
                    sea[i][j] = 0;
                    continue;
                }
                if (Integer.parseInt(temp[j]) == 1) {
                    feed.add(new Fish(i, j, 0, 0,0));
                }
                sea[i][j] = Integer.parseInt(temp[j]);
            }
        }

        if (feed.isEmpty()) {
            System.out.println(0);
            return;
        }


        // 먹이를 찾는 과정에서 먹을 수 있는 먹이들의 위치를 저장하기 위한 우선순위큐
        // 내부 정렬 기준은 다음과 같다.
        // 1. 가장 거리가 가까운 먹이
        // 2. 거리가 같은 경우 위에 있는 먹이
        // 3. 같은 행에 있으면 가장 왼쪽에 있는 먹이
        PriorityQueue<Fish> pq = new PriorityQueue<Fish>(new Comparator<Fish>() {
            @Override
            public int compare(Fish o1, Fish o2) {
                if (o1.dist == o2.dist) {
                    if (o1.x == o2.x) {
                        return o1.y - o2.y;
                    } else {
                        return o1.x - o2.x;
                    }
                } else {
                    return o1.dist - o2.dist;
                }
            }
        });

        queue.offer(shark);

        while(true) {
            boolean[][] visited = new boolean[N][N];
            visited[queue.peek().x][queue.peek().y] = true;

            while (!queue.isEmpty()) {
                Fish fish = queue.poll();
                int nowRow = fish.x;
                int nowCol = fish.y;

                for (int i = 0; i < 4; i++) {
                    int mr = nowRow + dx[i];
                    int mc = nowCol + dy[i];

                    if (mr < 0 || mr >= N || mc < 0 || mc >= N || sea[mr][mc] > fish.size || visited[mr][mc]) {
                        continue;
                    }

                    if (sea[mr][mc] < fish.size && sea[mr][mc] != 0) {
                        pq.offer(new Fish(mr, mc, fish.size, fish.eatCount + 1, fish.dist + 1));
                    }

                    queue.offer(new Fish(mr, mc, fish.size, fish.eatCount, fish.dist +1));
                    visited[mr][mc] = true;
                }
            }

            if (pq.isEmpty()) {
                System.out.println(result);
                return;
            }

            Fish fish = pq.poll();
            if (fish.size == fish.eatCount) {
                fish.size++;
                fish.eatCount = 0;
            }
            sea[fish.x][fish.y] = 0;
            result += fish.dist;
            queue.offer(new Fish(fish.x, fish.y, fish.size, fish.eatCount, 0));
            pq.clear();
        }
    }

    static class Fish {
        int x;
        int y;
        int size;
        int eatCount;
        int dist;

        public Fish(int row, int col, int size, int eatCount, int distance) {
            this.x = row;
            this.y = col;
            this.size = size;
            this.eatCount = eatCount;
            this.dist = distance;
        }
    }
}
