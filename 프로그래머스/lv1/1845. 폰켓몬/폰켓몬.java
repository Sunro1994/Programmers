import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int length = nums.length/2;    
        
      IntStream stream = Arrays.stream(nums);
	nums = stream.distinct().sorted().toArray();  
    if (nums.length==1) return 1;
    if (nums.length>length) return length;
    answer = nums.length;
    
        
        return answer;
    }
}