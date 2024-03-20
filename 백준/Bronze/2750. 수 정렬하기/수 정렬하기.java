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
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            arr[i] = x;
        }

        for (int i = 0; i < N-1; i++) {
            for (int x = i+1; x<N; x++) {
                if(arr[i]>arr[x]) {
                    swap(i,x,arr);
                }
            }
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
