class Solution {
    public int solution(String[] input1) {
       int answer =0;
        for(int i=0; i<input1.length; i++) {
        	input1[i] = input1[i].replaceFirst("aya", " ");
        	input1[i] = input1[i].replaceFirst("ma", " ");
        	input1[i] = input1[i].replaceFirst("ye", " ");
        	input1[i] = input1[i].replaceFirst("woo", " ");
        	
        	input1[i]= input1[i].replaceAll(" ", "");
        	
        	if(input1[i].equals("")) answer++;
        }
        
        return answer;
}
}