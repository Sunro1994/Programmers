class Solution {
    public String solution(String s) {
       String[] arr = s.split(" ");
	String answer = "";
	
	for(String i: arr) {
		if(i.length()==0) answer +=" ";
		else {
			answer +=i.substring(0,1).toUpperCase();
			answer += i.substring(1,i.length()).toLowerCase();
			answer +=" ";
		}
	}
	
	answer = s.endsWith(" ") ? answer : answer.substring(0,answer.length()-1);
        return answer;
    }
}