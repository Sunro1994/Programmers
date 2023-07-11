class Solution {
    public long solution(int[] common) {
       long answer =0;
	long gap =0;
	if(common[2]-common[1] == common[1]-common[0])
		{gap= common[2]-common[1];
		answer = common[common.length-1]+gap;
		}
	else{
		gap= common[2]/common[1];
		answer = common[common.length-1]*gap;
		}	
        return answer;
    }
}