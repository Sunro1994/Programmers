import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int i=0;
      Stack<Integer> st = new Stack<Integer>();
	
	while(i<arr.length) {
		if(st.isEmpty()) {
			st.push(arr[i]);
			i++;
		}
		
		else if(!st.isEmpty() &&st.peek() == arr[i]) {
			int pop= st.pop();
//			System.out.println(pop+"이 빠짐, i ="+i);
			i++;
		}
		else if(!st.isEmpty() && st.peek() != arr[i]) {
			int push = st.push(arr[i]);
//			System.out.println(push+"가 들어감, i ="+i);
			i++;
		}
	}
	int[] answer = new int[st.size()];
	if(st.size()==0) answer = new int[] {-1};
	int size =st.size();
	for(int j=size-1; j>=0; j--) {
		answer[j] = st.pop();
	}
      
        return answer;
    }
}