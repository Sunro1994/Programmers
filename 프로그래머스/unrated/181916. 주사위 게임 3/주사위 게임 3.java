class Solution {
    public int solution(int a, int b, int c, int d) {
       int[] arr = {a,b,c,d};
	int result= 0;
	int cnt =0;
	
	int[] stack = new int[7];
	
	for(int i=0; i< arr.length;i++) {
		int  pushNum= arr[i];
		
		if(stack[pushNum]==0) {
			cnt++;
			stack[pushNum]++;
		}
		else stack[pushNum]++;
	}
	//System.out.println("cnt:"+cnt);
	//System.out.println("stack배열 : "+Arrays.toString(stack));
	//1. cnt가 1일때
	if(cnt==1)	result = 1111*a;
	//2. cnt가 2일때 - 하나의 숫자 개수가 더큼
	if(cnt==2) {
		//flag가 true이면 하나의 개수가 3개인것으로 연산
		boolean flag = false;
		int max = 0;
		int min=0;
		for(int i=0; i<stack.length;i++) {
			if(stack[i]==3) {flag=true; max=i;}
			else if(stack[i]==1) min=i;
		}
		if(flag==true) {
			int x = (10*max)+min;
			result = x*x; 
		}
		else {
			max = a;
			for(int i=0; i<stack.length;i++) {if(i!=max && stack[i]!=0) min=i; }
			result = (max+min)*Math.abs(max-min);
		}
	}
	
	
	//3. cnt가 3일때 - 하나의 큰 숫자를 제외하고 나머지 둘을 곱한다.
	if(cnt==3) {
		result=1;
		for(int i=0;i<stack.length;i++) {
			if(stack[i]==1) result *=i;
		}
	}
	
	//4. cnt가 4일때 - 가장 작은 숫자를 골라 출력한다.
	if(cnt==4) {
		result=0;
		int min =10;
		for(int i=1; i<stack.length;i++) {
			if(stack[i]!=0) {result = i<min?i:min; break;}
		}
	}
        return result;
    }
}