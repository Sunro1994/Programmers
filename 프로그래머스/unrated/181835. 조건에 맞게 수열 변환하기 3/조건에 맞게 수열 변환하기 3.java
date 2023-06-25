class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        boolean t = k%2==0;
        for(int i=0; i<arr.length;i++){
            if(t) arr[i] +=k;
            if(!t) arr[i] *=k;
        }
        return arr;
    }
}