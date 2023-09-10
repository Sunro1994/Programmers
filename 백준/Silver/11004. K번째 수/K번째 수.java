import java.util.*;
class Main {
	//swap 메서드
	public static void swap(int[] a , int n1 , int n2) {
		int tmp = a[n1];
		a[n1] = a[n2];
		a[n2] = tmp;
	}
	
	public static void sort(int[] a, int x) {
		m_pivot_sort(a, 0, a.length-1,x-1);
	}
	
	public static void m_pivot_sort(int[] a, int lo, int hi,int x) {
		
		//lo가 hi와 겹치거나 더 크다면 정렬할 내용이 없으므로 바로 함수 종료
		if(lo >= hi) {return;}
		
		//피벗(기준)을 정하는 함수를 통해 결과를 불러온다.
		int pivot = partition(a,lo,hi);
		
		//불러온 피벗을 기준으로 좌우를 놔눠 재귀함수를 통해 정렬
		m_pivot_sort(a,lo,pivot,x);
		m_pivot_sort(a,pivot+1,hi,x);
		
	}
	
	public static int partition(int[] a, int lo, int hi) {
		
		int left = lo-1;
		int right = hi+1;
		//기준점이 될 가운데 피벗
		int pivot= a[(left+right)/2];
		
		while(true) {
			//한 칸 전진하며 0부터 시작
			do {
				left++;
				//pivot보다 작을때까지 이동
			}while(a[left] < pivot);
			
			//한칸 전진하며 마지막인덱스부터 시작
			do {
				right--;
				//pivot보다 hi가 크고 lo보다 크거나 같을때까지
			}while(a[right]>pivot && left<=right);
			
			
			if(left>=right) {
				//lo와 hi가 정렬되고 더 이상 정렬될 수가 없을때 (lo와 hi가 겹치거나 hi가 lo보다 인덱스가 적어지는 경우)
				return right;
			}
			
			//lo에는 pivot보다 큰수가, hi에는pivot보다 작은 수가 들어있다. 서로 스왑해준다.
			swap(a,left,right);
		}
		
		
		
		
	}
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		
		int[] a =new int[sc.nextInt()];
		int k = sc.nextInt();
		
		for(int i=0; i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		Main.sort(a,k);
		System.out.println(a[k-1]);
	}
	
}
