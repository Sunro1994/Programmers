import java.util.*;

public class Main {
    static int[] cal = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
    static String[] week = new String[]{"MON","TUE","WED","THU","FRI","SAT","SUN"};
    static int month, day;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        month = sc.nextInt();
        day = sc.nextInt();
        int sum =0;

        if (month >= 2) {
            for (int i = 0; i < month-1; i++) {
                sum += cal[i];
            }
            sum+=day;
        }else{
            sum +=day;
        }

        int result = (sum-1)%7;
        System.out.println(week[result]);



    }
}
