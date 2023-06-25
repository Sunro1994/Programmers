import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
      Stack<String> st = new Stack<String>();
	int missIndex =0;
	int cnt =0;
	int realNum = 0;
	for(int i=0; i<words.length;i++) {
		if(i==0) {st.push(words[i]); cnt++; continue;}
		if(i!=0&& !(words[i].charAt(0)+"").equals(st.peek().charAt(st.peek().length()-1)+""))
        {cnt++;missIndex = i;break;}
		else if(i!=0 && i!=0 && st.indexOf(words[i])>=0) {cnt++;missIndex = i; break;}
		else {st.push(words[i]);  cnt++;}
	}
//	System.out.println(missIndex);
//	System.out.println(cnt);
	realNum = cnt/n + (cnt%n>0?1:0);
	int[] answer = new int[2];
	if(missIndex==0) { answer[0] =0; answer[1]=0; return answer;}
	answer[0] = missIndex%n+1;
	answer[1] = realNum;


        return answer;
    }
}