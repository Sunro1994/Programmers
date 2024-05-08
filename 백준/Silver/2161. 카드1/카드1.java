import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <=x; i++) {
            list.add(i);
        }

        List<Integer> answer = new ArrayList<>();


        while (list.size() != 1) {
            int drop = list.pollFirst();
            answer.add(drop);
            int toBottom = list.pollFirst();
            list.add(toBottom);
        }

        answer.forEach(i -> System.out.print(i+" "));
        System.out.print(list.pollFirst());




    }
}
