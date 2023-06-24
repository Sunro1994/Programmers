import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
       int i=0;
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	while(i<arr.length) {
		if(list.isEmpty()) {list.add(arr[i]); i++; continue;}
		if(!list.isEmpty() && list.get(list.size()-1)<arr[i]) {list.add(arr[i]); i++;continue;}
		if(!list.isEmpty() && list.get(list.size()-1)>=arr[i]) {list.remove(list.size()-1);continue;}
	}
	
	int[] answer = list.stream().mapToInt(Integer::valueOf).toArray();
        return answer;
    }
}