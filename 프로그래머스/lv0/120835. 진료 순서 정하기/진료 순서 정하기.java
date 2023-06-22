import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer;
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	answer = Arrays.stream(emergency).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::valueOf).toArray();
	
	for(int i=0; i<emergency.length;i++) {
		map.put(answer[i], i+1);
	}
	int cnt =0;
	answer = new int[emergency.length];
	for(int i: emergency) answer[cnt++]= map.get(i);
	
        return answer;
    }
}