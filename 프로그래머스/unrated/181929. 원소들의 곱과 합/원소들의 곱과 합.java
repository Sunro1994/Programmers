class Solution {
    public int solution(int[] num_list) {
        
        int multi = 1;
        int sum = 0;
        for(int i=0 ;i<num_list.length ;i++) 
        {
            sum +=num_list[i]; 
            multi *=num_list[i];}
        return Math.pow(sum,2)>multi? 1 : 0;
    }
}