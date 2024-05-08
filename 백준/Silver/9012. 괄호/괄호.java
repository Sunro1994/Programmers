import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> list = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
        String x = br.readLine();
            list.add(x);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(isValid(list.get(i)));
        }


    }

    private static String isValid(String s) {
        String answer = "YES";

        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();



        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);
            if(s.charAt(i)=='(') s1.push(target);
            else s2.push(target);

            if(s1.size()<s2.size()) return "NO";
        }

        if(s1.size()!= s2.size()) return "NO";

        return "YES";
    }
}
