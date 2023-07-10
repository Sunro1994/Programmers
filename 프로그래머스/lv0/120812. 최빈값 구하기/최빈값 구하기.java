import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
	int[] score = new int[1000];
	
	for(int i : array) score[i]++;
	int max =-1;
    
    //배열의 길이가 1일때 
    if(array.length==1) return array[0];
        
	//max의 값이 겹치지 않을때
	int index=0;
	for(int i=0; i<score.length;i++) {
		if(max<score[i]) {
			max=score[i];
			index = i;
			}
		}
    
	// max의 값의 count가 2이상일때
	int cnt=0;
	for(int i: score) if(max==i) cnt++;
        
        return cnt>1?-1 : index;
    }
}