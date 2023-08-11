import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
	Map<String, Integer> map = new HashMap<String, Integer>();
	
	for(String i : participant) {
		map.put(i, map.getOrDefault(i, 0)+1);
	}
	
	for(int i=0; i<completion.length; i++) {
		String looser = completion[i];
		map.put(looser, map.get(looser)-1);
	}
	
	ArrayList<String> list = new ArrayList<String>();
	
	map.keySet().forEach(i -> {
		if(map.get(i)>0) list.add(i);
	});
	String answer ="";
	for(String i : list) {
		answer += i;
	}
        return answer;
    }
}