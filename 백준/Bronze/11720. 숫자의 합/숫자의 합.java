import java.util.Scanner;

 class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		
		String N = sc.nextLine();
		int answer =0;
		for(int i=0; i<N.length();i++) {
			answer += Integer.parseInt(N.charAt(i)+"");
		}
		
		System.out.println(answer);
	}
}
