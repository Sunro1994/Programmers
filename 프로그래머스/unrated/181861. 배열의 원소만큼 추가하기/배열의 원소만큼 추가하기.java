class Solution {
    public int[] solution(int[] arr) {
        int cnt = 0;
        for(int i : arr) cnt += i;
        int[] answer = new int[cnt];
        cnt=0;
        for(int i: arr) {
            for(int j=0; j<i ; j++){
                answer[cnt++] = i;
            }
        }
        
        
        return answer;
    }
}