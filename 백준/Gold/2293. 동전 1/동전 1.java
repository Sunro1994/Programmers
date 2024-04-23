
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static int n;
    static int k;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int[] wallet = new int[n+1];
        int[] arr = new int[k+1];

        arr[0] =1;

        for (int i = 1; i <=n; i++) {
            wallet[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i <=n; i++) {
            for (int j = wallet[i]; j <= k; j++) {
                if(j>=wallet[i]){
                    arr[j] = arr[j] + arr[j - wallet[i]];
                }
            }
        }

        System.out.println(arr[k]);





    }
}
