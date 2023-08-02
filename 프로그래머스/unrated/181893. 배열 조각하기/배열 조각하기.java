import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
       LinkedList<Integer> list = new LinkedList<Integer>();
	for(int i:arr) list.add(i);
	
	for(int i=0; i<query.length;i++) {
		if(i%2==0) {
			int index = query[i]+1;
			int len = list.size();
			
			for(int even=index; even<len;even++) {
				list.pollLast();
			}
		}
		if(i%2!=0) {
			int index2 = query[i];
			for(int odd=0; odd<index2; odd++) {
				list.pollFirst();
			}
		}

	}
	int[] answer = new int[(list.size())];
	for(int i=0; i<answer.length;i++) {
		answer[i] = list.get(i);
	}
        
        
        
        
        
        
        return answer;
    }
}