import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
       String[] arr = new String[my_string.length()];
	ArrayList<String> list = new ArrayList<String>();
	
	for(int i=0; i<arr.length;i++) {
		list.add(my_string.substring(i));
	}
	
	
	list.sort((a,b) -> a.compareTo(b));
	
	list.forEach(System.out::println);
	
	for(int i=0; i<arr.length;i++) {
	arr[i]	=list.get(i)  ;
	}
        return arr;
    }
}