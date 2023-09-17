import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double max = -1;
		double[] arr = new double[N];
		for(int i=0; i<N;i++) {  
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]);
		}
		double sum=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<=max) arr[i]= ((double)arr[i]/max)*100;
			sum += arr[i];
		}
		System.out.println(sum/N);
    }
}