import java.util.*;

class Main{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int T = Integer.parseInt(sc.nextLine());
	
	
	String[] arr = new String[T];
	
	for(int i=0; i<arr.length;i++) {
		arr[i]= sc.nextLine();
	}
	for(int i=0; i<arr.length;i++) {
		String answer = "";
		answer += ""+arr[i].charAt(0)+ arr[i].charAt(arr[i].length()-1);
		System.out.println(answer);
	}
}
    
}