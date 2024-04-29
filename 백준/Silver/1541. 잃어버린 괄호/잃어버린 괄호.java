import java.util.*;

public class Main {
    static String N;
    public static void main(String[] args) {

        //-문자가 있는 뒤 숫자들을 모두 더한 후 뺴기
        // 나머지 숫자들은 더하기
        Scanner sc = new Scanner(System.in);
        int sum = Integer.MAX_VALUE;
        StringTokenizer target = new StringTokenizer(sc.nextLine(),"-");
        int cnt=0;

        while (target.hasMoreTokens()) {
            int getSum=0;
            StringTokenizer addSt = new StringTokenizer(target.nextToken(),"+");

            while (addSt.hasMoreTokens()) {
                getSum += Integer.parseInt(addSt.nextToken());
            }

            if (cnt == 0) {
                sum =getSum;
                cnt++;
            }
            else{
                sum -= getSum;
            }
        }
        System.out.println(sum);

    }
}
