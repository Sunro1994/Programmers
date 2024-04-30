import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList();
        int maxLen = 0;
        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            list.add(str);
            maxLen = Math.max(maxLen, str.length());
        }

    int cnt =0;
        while (cnt < maxLen) {
                for (int i = 0; i < 5; i++) {
            if (cnt < list.get(i).length()) {
                    System.out.print(list.get(i).charAt(cnt));
                }
            }
            cnt++;
        }

    }
    
}
