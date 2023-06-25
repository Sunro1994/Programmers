class Solution {
    public int solution(int n) {
        int even = 0;
        int odd = 0;
        
        if(n%2==0) for(int i=1 ; i<=n; i++){
            if(i%2==0) even+=Math.pow(i,2); 
        }
        else for(int i=1; i<=n; i++){
            if(i%2!=0) odd +=i;
        }
        
        
        return n%2==0? even : odd;
    }
}