class Solution {
    public int[] solution(int[] num_list, int n) {
        n = n-1;
        int cnt=0;
        int[] answer = new int[num_list.length-n];
        for(int i=n; i<num_list.length;i++){
            answer[cnt++] = num_list[i];
        }
        
        
        return answer;
    }
}