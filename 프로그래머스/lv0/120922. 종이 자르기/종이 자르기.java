class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        
        //직사각형
        //2 > 1/1(1)   3 > 1/1/1(2)
        //5 > 1/1/1/1/1 (4)   
        
        //정사각형
        //2 //2(1)
        
        //2(1),5(4*2) =>4*2+1 9    3(2),5(4*3) => 14
        
        answer = (M-1) + ((N-1)*M);
        return answer;
    }
}