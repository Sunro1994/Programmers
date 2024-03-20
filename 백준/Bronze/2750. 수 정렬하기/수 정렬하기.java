
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            arr[i] = x;
        }

        for (int i = 0; i < N-1; i++) {
            for (int x = 0; x<N-1-i; x++) {
                if(arr[x]>arr[x+1]) {
                    swap(x,x+1,arr);
                    cnt++;
                }
            }
                if(cnt==0) break;

        }

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }

    }

    private static void swap(int i, int x, int[] arr) {
        int tmp =0;
        tmp = arr[i];
        arr[i] = arr[x];
        arr[x] = tmp;
    }
}
