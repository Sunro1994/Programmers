import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] num1 = {1,2,3,4,5};				//5개씩 반복
	int[] num2 = {2,1,2,3,2,4,2,5};			//8개씩 반복
	int[]  num3 = {3,3,1,1,2,2,4,4,5,5};	//10개씩 반복
	
	int n1=0;
	int n2=0;
	int n3=0;
	for(int i=0; i<answers.length;i++) {
		if(num1[i%5]== answers[i]) n1+=1;
		if(num2[i%8]== answers[i]) n2 +=1;
		if(num3[i%10]== answers[i]) n3 +=1;
	}
	int max = Math.max(n1, Math.max(n2, n3));
	
	ArrayList<Integer> arr = new ArrayList<Integer>(3);
	
		if(max == n1) arr.add(1);
		if(max == n2) arr.add(2);
		if(max == n3) arr.add(3);
	
	arr.trimToSize();
	
	
	System.out.println(arr.size());
int[] answer = new int[arr.size()];
for(int i=0; i<arr.size();i++) 
	answer[i] = arr.get(i);
	    
        return answer;
    }
}