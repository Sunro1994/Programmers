import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] num_list) {
        
        List<Integer> arr = new ArrayList<>();
	
	for(int i : num_list )  arr.add(i);
	
	arr.sort((a,b) -> a-b);
	
	int[] answer = new int[5];
	for(int i=0; i<5; i++) {
		answer[i] = arr.get(i);
	}
        return answer;
    }
}