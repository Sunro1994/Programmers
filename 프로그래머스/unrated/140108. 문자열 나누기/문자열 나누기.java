import java.util.*;

class Solution {
    public int solution(String s) {
      int len = s.length();
	int answer=0;
	int otherCnt=0;
	
	Map<String, Integer> map = new HashMap<String, Integer>();
	for(int i=0; i<len;i++) {
		String x = s.charAt(0)+"";
		
		if(i==0 || x.equals(s.charAt(i)+"")) {
			map.put(x, map.getOrDefault(x, 0)+1);
			continue;
		}
		else otherCnt++;
		
		
		//2. 다른 글자가 나오면 똑같이 put하고 x와 비교
		if(map.get(x) == otherCnt){
			s= s.substring(i+1);
			len = s.length();
			answer++;
			i=-1;
			map = new HashMap<String, Integer>();
			otherCnt =0;
		}
		//인덱스의 마지막까지 가서도 횟수가 모두 다르고 더 이상 읽을 글자가 없다면 분리하고 종료
	}
	
	if(!map.isEmpty()) answer++;
        return answer;
    }
}