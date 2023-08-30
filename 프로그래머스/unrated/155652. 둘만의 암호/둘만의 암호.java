import java.util.*;

class Solution {
		
    public String solution(String s, String skip, int index) {
		List<String> list = new ArrayList<String>();
		String answer = "";
		
		for(int i=97; i<=122;i++) {
			list.add((char)i+"");
		}
		
		for(int i=0; i<skip.length();i++) {
			String x = skip.charAt(i)+"";
			if(list.contains(x)) {
				list.remove(list.indexOf(x));
			}
		}

		for(int i=0; i<s.length();i++) {
			char target = s.charAt(i);
			for(int j=0; j<index;j++) {
				
			while(!list.contains(target+"")) {
				target = ++target;
			}
			target = ++target;
                while(!list.contains(target+"")) {
				target = ++target;
			}
			if(target>=123) target = (char)((int)target-26);
			}
			answer +=target;
		}
        return answer;
    }
}
