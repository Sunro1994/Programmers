import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = arr;
        int cnt =0;

        for(int i = 0; i < query.length; i++) {
        	//System.out.println(Arrays.toString(answer));
        	if(i % 2 == 0) {
        		int index = query[i]+1;
        		int len = answer.length;
        		//System.out.println(index);
        		for(int even = index; even<len; even++) {
        		answer = Arrays.copyOfRange(answer, 0, answer.length-1);
        		//System.out.println("1" + Arrays.toString(answer));
        		}
        	}
        	else {
        		int index = query[i];
        		//System.out.println(index);
        		for(int odd =0; odd<index; odd++) {
        		answer = Arrays.copyOfRange(answer, 1, answer.length);
        		//System.out.println("2" + Arrays.toString(answer));
        		}
        	}
        }
        return answer;
	}
}