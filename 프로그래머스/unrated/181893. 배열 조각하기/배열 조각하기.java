import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<Integer>();
	for(int i: arr) list.add(i);	
	for(int i=0; i<query.length;i++) {
		if(i%2==0) {
			int start = query[i]+1;
			int cnt = list.size()-start;
			for(int j=start; cnt!=0;cnt--) {
				list.remove(j);
			}	
					}
		else {
			int end = query[i];
			int cnt = end;
			for(int x=0; cnt!=0;cnt--) list.remove(x);
			}//else
		}//for
	
	
	int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}