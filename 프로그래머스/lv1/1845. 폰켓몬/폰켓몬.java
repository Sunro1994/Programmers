import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] nums) {
        int length = nums.length/2;
        int answer =0;
	
	
	
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	for(int i=0; i<nums.length;i++) {
		map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
	}
	
	
	if(map.keySet().size()>length) answer = length;
	else answer = map.keySet().size();
	if(map.keySet().size()==1) answer =1;
    
        
        return answer;
    }
}