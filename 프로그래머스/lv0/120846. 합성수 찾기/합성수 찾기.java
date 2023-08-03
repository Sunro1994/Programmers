class Solution {
        static int findNumber(int n) {
            int cnt =0;
            for(int i=1; i<=n ; i++){
                if(n%i==0) cnt++;
            }
            return cnt>2? 1: 0;
        }//findNumber
    
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n ; i++){
            answer += findNumber(i);
        }
        
        return answer;
    }
}