class Solution {
    public int[] solution(int[] arr, int[][] queries) {
       int min = -1;
	// arr[queries[0][0]]< queries[0][1] <arr[queries[0][2]]
	// arr[queries[1][0]]< queries[1][1] <arr[queries[1][2]]
	// arr[queries[2][0]]< queries[2][1] <arr[queries[2][2]]
	
	//정답을 담을 배열
	int[] answer = new int[queries.length];
	//이차원 배열의 첫 배열에 진입
	for(int i=0; i<queries.length;i++) {
		//start,end,k를 지정
		int start = queries[i][0];
		int end = queries[i][1];
		int k = queries[i][2];
		//이차원 배열에 진입, 조건에 맞게 반복
		// start와 end사이에서 k보다큰수중, 가장 작은 수
		for(int j=start; j<=end;j++) {
			if(arr[j]> k && min ==-1) {min=arr[j];}
			else if(arr[j]>k) {min = min<arr[j]?min:arr[j];}
		}
		answer[i] = min;
		min = -1;
	}
        return answer;
    }
}