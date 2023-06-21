class Solution {
    public int solution(int[] date1, int[] date2) {
        int x =0;
		for(int i=0; i<date1.length;i++) {
			if(date1[i] != date2[i]) {
                x=i;
                break;
		}
	
		
        
        
        
    }
        return date1[x] < date2[x]? 1 : 0;
}
}