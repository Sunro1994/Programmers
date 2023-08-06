
class Solution {
    public int solution(int[][] dots) {
        int answer =0;
    boolean c1 = ((dots[0][1] - dots[1][1])/(double) (dots[0][0] - dots[1][0])) == ((dots[2][1] - dots[3][1])/(double)( dots[2][0] - dots[3][0]));
	boolean c2 = ((dots[0][1] - dots[2][1])/(double) (dots[0][0] - dots[2][0])) == ((dots[1][1] - dots[3][1])/(double) (dots[1][0] - dots[3][0]));
	boolean c3 = ((dots[0][1] - dots[3][1])/(double) (dots[0][0] - dots[3][0])) == ((dots[1][1] - dots[2][1])/(double)(dots[1][0] - dots[2][0]));

	
	
	if(c1||c2 || c3) answer =1;
        return answer;
    }
}