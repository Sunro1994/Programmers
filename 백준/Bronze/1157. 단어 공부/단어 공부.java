import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        str = str.toUpperCase();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            String x = str.charAt(i)+"";
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max =Integer.MIN_VALUE;
        String maxStr = "";

        int maxCnt=0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(max < entry.getValue()){
                max = entry.getValue();
                maxStr = entry.getKey();
                maxCnt=0;
            } else if (max == entry.getValue()) {
                maxCnt++;
            }
        }

        System.out.println(maxCnt>=1?"?":maxStr);

    }
}
