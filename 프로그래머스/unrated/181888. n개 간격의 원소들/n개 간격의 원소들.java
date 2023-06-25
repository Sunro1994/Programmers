class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int cnt =0;
        
        for(int i=0; i<num_list.length;i+=n){
            cnt++;
        }
        answer = new int[cnt];
        cnt=0;
        for(int i=0; i<num_list.length; i+=n){
            answer[cnt++] = num_list[i];
        }
        return answer;
    }
}