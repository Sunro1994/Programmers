class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char[] myString1 = myString.toCharArray();
	for(int i=0 ; i<myString1.length;i++) {
		myString1[i]= myString1[i] == 'A'? 'B':'A';
	}
	
	String str1 = "";
	for(char i : myString1) str1+=i;
	
        
        
        
        return str1.contains(pat)? 1 : 0;
    }
}