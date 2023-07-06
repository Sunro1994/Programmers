import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int k) {
        arr = Arrays.stream(arr).distinct().toArray();
	
	
	int[] answer = new int[k];
	
	//arr배열의 수가 담을 배열의 길이보다 같거나 많을때
	if(arr.length >= k ) {
		for(int i=0; i<k; i++) {
			answer[i] = arr[i];
		}
	}
	//arr배열의 수가 담을 배열의 길이보다 적을때, 나머지는 -1로 채운다.
	if(arr.length < k) {
		for(int i=0;i<arr.length;i++) {
			answer[i] = arr[i];
		}
		for(int j=arr.length; j<k;j++) {
			answer[j] = -1;
		}
	}
        return answer;
    }
}