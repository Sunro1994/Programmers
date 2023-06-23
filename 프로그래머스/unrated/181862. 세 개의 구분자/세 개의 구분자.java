import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public String[] solution(String myStr) {
       String[] result = myStr.split("[a|b|c]");
	
	result = Stream.of(result).filter(i-> !i.isEmpty()).toArray(String[]::new);
	if(result.length ==0) result= new String[]{"EMPTY"};
     
        return result;
    }
}