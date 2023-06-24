import java.math.*;
class Solution {
    public String solution(String a, String b) {
        BigInteger biA = new BigInteger(a);
BigInteger biB = new BigInteger(b);
	
String result = String.valueOf(biA.add(biB));
        return result;
    }
}