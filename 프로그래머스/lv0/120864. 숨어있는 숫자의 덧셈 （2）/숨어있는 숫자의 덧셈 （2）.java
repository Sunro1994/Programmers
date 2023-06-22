import java.util.*;
class Solution {
    public int solution(String my_string) {
       my_string= my_string.replaceAll("[a-zA-Z]", " ");
	String[] answer = my_string.split(" ");
	
	 

        
        
        
        
        return Arrays.stream(answer).filter(i-> !i.equals("")).mapToInt(Integer::valueOf).sum();
    }
}