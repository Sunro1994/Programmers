import java.util.*;

public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
	
	int[] arr = new int[26];
	for(int i=0; i<arr.length;i++) {
		arr[i]=-1;
	}
	
	for(int i=0; i<str.length();i++) {
		if(arr[str.charAt(i)-'a']==-1) arr[str.charAt(i)-'a'] = i;
	}
	for(int i : arr) System.out.print(i+" ");
}
}