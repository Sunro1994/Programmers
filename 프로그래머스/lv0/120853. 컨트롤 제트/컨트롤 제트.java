class Solution {
    public int solution(String s) {

        String[] s_arr = s.split(" ");
	int answer =0;
	for(int i=0; i<s_arr.length;i++) {
		if(s_arr[i].equals("Z")) answer -= Integer.parseInt(s_arr[i-1]);
		else answer += Integer.parseInt(s_arr[i]);
	}
        return answer;
    }
}