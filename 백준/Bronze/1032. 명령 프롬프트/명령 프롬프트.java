import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
    static int N;
    static ArrayList<String> list;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        list = new ArrayList<>();
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String target = br.readLine();
            list.add(target);
        }

        int len = list.get(0).length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            boolean x = true;
            char c = list.get(0).charAt(i);
            for (int j = 1; j < N; j++) {
                if(c != list.get(j).charAt(i)) x = false;
            }
            if (x) {
                sb.append(c);
            }else{
                sb.append("?");
            }
        }
        System.out.println(sb);



    }
}
