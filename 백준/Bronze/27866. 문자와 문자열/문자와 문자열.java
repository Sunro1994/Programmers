import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String x = sc.nextLine();
        int k = sc.nextInt();
        
        System.out.print(x.charAt(k-1));
    }
}