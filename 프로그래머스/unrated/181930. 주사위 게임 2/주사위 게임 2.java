class Solution {
    public int solution(int a, int b, int c) {
        int result =0;
	int caseA = a+ b + c;
	int caseB = caseA*(int)(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2));
	int caseC = caseB*(int)(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3));
	
	if(a!=b && b!=c && a!=c) result += caseA;
	else result= caseB;
	if(a==b && b==c && c==a) result = caseC;
        
        return result;
    }
}