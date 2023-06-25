class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if(arr1.length != arr2.length) return arr1.length>arr2.length? 1 : -1;
        if(arr1.length == arr2.length) for(int i=0; i<arr1.length;i++) answer +=(arr1[i]-arr2[i]);
        return answer==0? 0: answer>0?1:-1;
    }
}