class Solution {
    public String solution(String my_string, int s, int e) {
       String[] answer =my_string.split("");
	
	while(s<=e) {
		System.out.printf("s : %d, e : %d",s,e);
		System.out.println();
		String tmp= answer[s];
		answer[s]=answer[e];
		answer[e]=tmp;
		s++;
		e--;
	}
        String result ="";
	for(String i : answer) result+=i;
        return result;
    }
}