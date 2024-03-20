import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String x = st.nextToken();
        int[] arr = new int[x.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(x.substring(i, i + 1));
        }

        for (int i = 0; i < arr.length; i++) {
            int max =i;
            for (int y = i+1; y < arr.length; y++) {
                if(arr[y] > arr[max]) {
                    max=y;
                }
            }
            if (arr[i] < arr[max]) {
                swap(i,max,arr);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    private static void swap(int i, int y, int[] arr) {
        int tmp =0;
        tmp  = arr[i];
        arr[i] = arr[y];
        arr[y] = tmp;

    }

}
