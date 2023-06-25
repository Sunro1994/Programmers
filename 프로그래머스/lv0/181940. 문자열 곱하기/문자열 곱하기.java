class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        
        while(k>0) {
            answer += my_string;
            k--;
        }
        return answer;
    }
}