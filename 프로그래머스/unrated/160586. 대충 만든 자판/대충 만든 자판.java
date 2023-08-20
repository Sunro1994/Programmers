class Solution {
    public static boolean isInclude(String target, String[] comp) {
		boolean flag = false;
		for(int x=0; x<target.length() ; x++) {
			String target_chr = target.charAt(x)+"";
		for(int i=0; i<comp.length;i++) {
			flag =comp[i].contains(target_chr);
			if(flag==true) break;
			}
		if(flag==false) return flag;
		}
		
		return flag;
	}
	public static int getTotal(String target, String[] comp) {
		int index =9999;
		for(int i=0; i<comp.length;i++) {
			if(comp[i].indexOf(target)!= -1 &&comp[i].indexOf(target) <index) 
				index = comp[i].indexOf(target)+1;
		}
		
		return index;
	}
    public int[] solution(String[] keymap, String[] targets) {
     int[] answer = new int[targets.length];
		int total =0;
		int cnt=0;
		
		/*
		 * 	변수 설정
		 *  해당 인덱스의 위치들을 총합할 total
		 *  total에 집어넣을 해당 문자의 최소 인덱스 정수
		 * 
		 	1. 반복문을 통해 targets배열중 하나를 지정*/
//		 	2. 2차 반복문을 통해 targets 배열중 하나의 문자를 순서대로 검색
		for(int x =0; x<targets.length; x++) {
			String target_str = targets[x];
			//비교할 배열에 들어있는 값들이 targets[x]의 각 문자들이 모두 포함되어 있는지 판단하는 함수 생성
			//true이면 반복문 진입
			if(isInclude(target_str, keymap)) {
				for(int y=0; y<target_str.length();y++) {
					//판단후 true이면 인덱스를 찾아서 수행하는 함수 생성
//		   			//단, 인덱스는 검색 배열에서 가장 작은 인덱스를 가져오도록 한다.
				
					total += getTotal(target_str.charAt(y)+"",keymap);
					
				}
			}
			answer[cnt] = total==0?-1 : total;
			cnt++;
			total = 0;
			
		}
        return answer;
    }
}