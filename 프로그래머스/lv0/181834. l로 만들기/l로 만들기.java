class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i=0;i<myString.length();i++){
            if(myString.charAt(i)-'l'<0) answer += 'l';
            else answer += myString.charAt(i);
        }
        return answer;
    }
}