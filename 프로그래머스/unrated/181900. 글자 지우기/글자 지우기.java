import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        indices = Arrays.stream(indices).sorted().toArray();

	
	String[] answer = my_string.split("");

	for(int i: indices) answer[i] = "";
	
	
	String result = ""; 
	for(int i=0; i<answer.length;i++) {
		if(answer[i] != " ") result+= answer[i];
        
        
        }
        
        return result;
    
}
}