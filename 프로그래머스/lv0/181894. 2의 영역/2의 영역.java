class Solution {
    public int[] solution(int[] arr) {
       int start = 0;
	int end =0;
	
	for(int i=0; i<arr.length;i++) {
		if(arr[i] ==2) {start = i; break;}
	}
	
	for(int i=arr.length-1; i>=0 ;i--) {
		if(arr[i]==2) {end =i; break;}
	}
	int[] answer = new int[end-start+1];
        if(start+end==0) {answer=new int[]{-1};
                          return answer;}
	int cnt =0;
	for(int i= start; i<=end;i++) {
		answer[cnt++] = arr[i];
	}
        return answer;
    }
}