import java.util.*;
class Solution {
    public int solution(String x) {
      String x1 = "";
		int answer = 0;
		for(int i=0; i<x.length();i++) {
			char target = x.charAt(i);
			if(target>=48 && target<=57) x1 += target;
			else x1+= " ";
		}
		
		String[] arr = x1.split(" ");
		
		for(int i=0; i<arr.length;i++) {
			String t1 = arr[i].replaceAll(" ", "");
			if(!t1.equals("")) answer += Integer.parseInt(t1);
		}
        return answer;
}
}