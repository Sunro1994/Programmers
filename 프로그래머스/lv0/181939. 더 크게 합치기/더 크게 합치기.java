class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = String.valueOf(a);
	String b1 = String.valueOf(b);
	
	int result = Integer.valueOf(a1+b1) > Integer.valueOf(b1+a1) ? Integer.valueOf(a1+b1): Integer.valueOf(b1+a1);
	
        
        return result;
    }
}