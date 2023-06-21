class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = my_string.indexOf(is_prefix)==0 ? 1:0;
        return answer;
    }
}