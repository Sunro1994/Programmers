import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<String> que = new LinkedList<>();
        String x = br.readLine();
        String answer ="";


        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i)=='<'){
                que.add(sb.reverse().toString());
                sb = new StringBuilder();
                sb.append(x.charAt(i));
                continue;
            }else if (x.charAt(i) == '>') {
                sb.append(x.charAt(i));
                que.add(sb.toString());
                sb = new StringBuilder();
                continue;
            }
            if (x.charAt(i) == ' ' && sb.indexOf("<")==-1) {
                que.add(sb.reverse().append(" ").toString());
                sb = new StringBuilder();

            }else{
            sb.append(x.charAt(i));
            }
            if (i == x.length() - 1 && sb.indexOf(">") == -1) {
                que.add(sb.reverse().toString());
            }

        }
        que.forEach(i-> System.out.print(i));
    }
}
