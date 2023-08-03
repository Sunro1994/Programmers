class Solution {
    public String solution(String my_string) {
        String answer = "";
	for(int i=0; i<my_string.length();i++) {
		String x = my_string.charAt(i)+"";
		if(answer.isEmpty()) {
			answer +=x;
			continue;
		}
		if(!answer.contains(my_string.charAt(i)+""))
		answer += x;
	}
        
        return answer;
    }
}