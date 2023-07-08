class Solution {
    public String solution(String my_string, int[][] queries) {
        String[] arr = my_string.split("");
	//이차원 배열중 일차 배열 진입
	for(int i=0; i<queries.length;i++) {
		//start
		int s = queries[i][0];
		//end
		int e = queries[i][1];
		
		while(s<=e) {
			String tmp = arr[s];
			arr[s] = arr[e];
			arr[e] = tmp;
			s++;
			e--;
		}
	}
        String answer = "";
	for(String i : arr) answer+= i;
        return answer;
    }
}