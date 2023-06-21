import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
    ArrayList<String> arr = new ArrayList<String>();
	
        for(int i = l ; i<=r; i++) {
		String x = String.valueOf(i);
			if(x.matches(".*[1-4||6-9].*")) continue;
			else arr.add(x);
	}
        
	int cnt=0;
	int[] answer = new int[arr.size()];
	for(int i=0; i<arr.size();i++) {
		answer[cnt++] = Integer.parseInt(arr.get(i));
	}
    if(arr.size()==0) answer = new int[] {-1};
        return answer;
    }
}