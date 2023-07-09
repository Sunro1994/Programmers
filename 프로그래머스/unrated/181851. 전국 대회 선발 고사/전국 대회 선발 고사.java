import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
	ArrayList<Integer> AvailList = new ArrayList<Integer>();
	
	for(int i=0; i<rank.length;i++) {
		if(attendance[i] == true) AvailList.add(rank[i]);
	}
	
	AvailList.sort(null);
	AvailList.forEach(System.out::print);
	System.out.println();
	int cnt=0;
	int answer =0;
	
	for(int i=0; i<AvailList.size(); i++) {
		int x = AvailList.get(i);
		for(int j=0; j<rank.length;j++) {
			if(x == rank[j] && cnt ==0) { answer += j*10000; cnt++; continue;}
			if(x == rank[j] && cnt ==1 ) { answer += j*100; cnt++; continue;}
			if(x == rank[j] && cnt ==2 ) { 
				answer += j; cnt++; break;}
		}
	}
        
        return answer;
    }
}