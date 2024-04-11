import java.util.*;
import java.io.*;
import java.lang.*;


public class Main {
    /*
    1. 같은 종류의 초밥이 둘 이상 있을 수 있다.
    2. 행사1 => 한 위치부터 k개의 접시를 연속해서 먹을경우 할인된 정액 가격 제공
    3. 행사1에 참여한 경우 쿠폰에 적혀진 종류의 초밥 하나를 추가로 무료로 제공
    3-1. 만약 적혀진 초밥이 현재 벨트 위에 없을 경우 요리사가 새로 만들어 손님을 제공

     슬라이딩 윈도우 사용하여 겹치지 않는 숫자 k개를 가진 배열을 정답 배열에 삽입
     무료쿠폰이 포함된 배열은 제외

     주어지는 값 :
     1. 접시의 수(N) , 초밥의 가짓수(d), 연속해서 먹는 접시의 수(k), 쿠폰 번호(c)

     2. 2<= N <= 3,000,000
     3. 2<=d<= 3000
     4. 2<= k<=3000
     5. k<=N, 1<=c<=d

     해결방법
     1. 초밥 배열 생성
     2. 4개씩 슬라이딩 윈도우
     3-1. 중복되는 값이 있는 경우를 모두 제외시켰을때 0인 경우 중복된 값이 있는 배열도 고려
     3-2. 쿠폰값이 들어있는 배열을 모두 제외시켰을때 0인경우 k를 출력 아니면 K+1출력

     */
    static int N;
    static int D;
    static int K;
    static int C;
    static int[] belt;
    static int[] visited;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        belt = new int[N];
        visited = new int[D+1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            belt[i] = Integer.parseInt(st.nextToken());
        }
        int onlyOneEat=1;
        visited[C]++;
        for (int i = 0; i < K; i++) {
            if(visited[belt[i]]==0) onlyOneEat++;
            visited[belt[i]]++;
        }

        int useEvent = onlyOneEat;

        for (int i = 1; i < N; i++) {
            int out = belt[i-1];
            visited[out]--;
            if(visited[out]==0) useEvent--;

            int add = belt[(i+K-1)%N];
            if(visited[add]==0) useEvent++;
            visited[add]++;

            onlyOneEat = Math.max(onlyOneEat,useEvent);

        }
        System.out.println(onlyOneEat);


    }

    }

