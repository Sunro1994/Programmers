class Solution {
    public static String PushStr(String A) {
		A= A.substring(A.length()-1)+A.substring(0,A.length()-1);
		return A;
	}
    public int solution(String A, String B) {
        int cnt=0;
        
	for(int i=0; i<A.length();i++) {
		if(B.equals(A)) {return cnt;}
		A = PushStr(A);
        cnt++;
    }
        return -1;
}
}