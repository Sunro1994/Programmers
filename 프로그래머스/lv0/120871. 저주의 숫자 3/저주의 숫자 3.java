class Solution {
    public int solution(int n) {
       int cnt=1;
	int real=1;
	
	while(cnt<=n) {
		if(			real%3==0 
				|| real%10 ==3 
				|| (real/10)%10==3)
			{real ++;
			while(real%3==0 
					|| real%10 ==3 
					|| (real/10)%10==3) real++;
				
			}
//		System.out.printf("10진법:%d , 3x마을 : %d\n",cnt,real);
		cnt++;
		real++;
	}
        return real-1;
    }
}