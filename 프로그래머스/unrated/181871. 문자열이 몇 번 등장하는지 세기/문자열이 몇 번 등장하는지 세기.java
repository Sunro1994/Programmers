class Solution {
    public int solution(String myString, String pat) {
        int cnt =0;
	System.out.println(myString.substring(0,pat.length()));
	
	for(int i=0; i<myString.length()-pat.length()+1;i++) {
		if(pat.equals(myString.substring(i,i+pat.length())))
			cnt++;
	}
        return cnt;
    }
}