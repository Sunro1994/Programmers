import java.util.ArrayList;    
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list= new ArrayList<>();
	
	for(int i=0; i<intStrs.length;i++) {
		if(k < Integer.parseInt(intStrs[i].substring(s,s+l)))
			list.add(Integer.parseInt(intStrs[i].substring(s,s+l)));
	}
	int[] answer = list.stream().mapToInt(Integer::valueOf).toArray();
        return answer;
    }
}