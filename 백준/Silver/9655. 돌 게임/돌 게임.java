
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int SK = 0;
        int CY = 0;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N < 3) {
            SK++;
            N--;
        }else{
            SK += 3;
            N -= 3;
        }


        while (N >0) {
            SK++;
            if (flag) {
            if (N < 3) {
                SK++;
                N--;
            }else{
                SK += 3;
                N -= 3;
            }
            flag = !flag;

            }else{
                if (N < 3) {
                    CY++;
                    N--;
                }else{
                    CY += 3;
                    N -= 3;
                }
                flag = !flag;
            }
        }
        System.out.println(flag?"SK":"CY");
    }
}
