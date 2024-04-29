import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<String> list = new ArrayList();

        int N = Integer.parseInt(st.nextToken());
        int M  = Integer.parseInt(st.nextToken());

        HashMap<String,Integer> map = new HashMap();

        for (int i = 0; i < N; i++) {
            String x =  br.readLine();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < M; i++) {
            String x =  br.readLine();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int cnt =0;
        for (String s : map.keySet()) {
            if(map.get(s)>=2)
                cnt++;
        }
        System.out.println(cnt);
        for (String s : map.keySet()) {
            if(map.get(s)>=2)
                list.add(s);
        }

        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }




    }
}
