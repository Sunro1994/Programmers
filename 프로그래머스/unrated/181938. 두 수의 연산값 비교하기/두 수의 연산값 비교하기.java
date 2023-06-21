class Solution {
    public int solution(int a, int b) {
       String a1 = String.valueOf(a);
	String b1 = String.valueOf(b);
	
	int result = Integer.valueOf(a1+b1) > Integer.valueOf(a1)*Integer.valueOf(b)*2 ? Integer.valueOf(a1+b1): Integer.valueOf(a1)*Integer.valueOf(b)*2;
	
        
        
        return result;
    }
}