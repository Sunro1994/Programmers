import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
        static int N;
        static int cycle;
        static String str;
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
           cycle = Integer.parseInt(st.nextToken());
            str = st.nextToken();
            System.out.println(repeatStr(cycle,str));
        }


    }

    private static String repeatStr(int cycle, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String target = str.charAt(i)+"";
            for (int j = 0; j < cycle; j++) {
                if(target.equals("\\") )   {
                    sb.append(target);
                    sb.append(target);
                }else sb.append(target);
            }
        }
        return sb.toString();
    }
}
