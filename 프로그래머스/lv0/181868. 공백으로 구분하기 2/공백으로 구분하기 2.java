import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<String>();
	String[] arr =my_string.split(" ");
	
	
	for(int i=0; i<arr.length;i++) {
		if(!arr[i].equals("")) {
			list.add(arr[i]);
		}
	}
        String[] answer = new String[list.size()];
	int cnt =0;
	for(int i=0; i<list.size();i++) {
		answer[cnt++] = list.get(i); 
	}
        
        
        return  answer;
    }
}