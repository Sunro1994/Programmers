import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];
        for(int i=0; i<N ;i++){
            a[i]= sc.nextInt();
        }
       
        for(int i = 1; i < a.length; i++) {
			int target = a[i];
			
			int j = i - 1;
			
			while(j >= 0 && target > a[j]) {
				a[j + 1] = a[j];	
				j--;
			}
			a[j + 1] = target;	
		}
        System.out.print(a[K-1]);
      
    }
    
}