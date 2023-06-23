import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int n) {
       HashSet<Integer> set = new HashSet<Integer>();
	int cnt=1;
	
	while(cnt!=n) {
		if(cnt!=1 &&n%cnt==0) {
			set.add(cnt);
			n= n/cnt;
		}
		else cnt++;
		if(cnt==n) set.add(cnt);
	
	}
	int[] answer = set.stream().sorted().mapToInt(Integer::valueOf).toArray();
	
        return answer;
    }
}