import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] x = a.toCharArray();
		for(int i=0; i<a.length();i++) {
			if(x[i]<97) x[i] += 32;
			else x[i] -=32;
		}
		for(char i : x) System.out.print(i);
    }
}