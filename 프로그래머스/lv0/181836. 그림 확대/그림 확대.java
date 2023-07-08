import java.util.ArrayList;
class Solution {
    public String[] solution(String[] picture, int k) {
     int cnt =k;
	String[] line;
	ArrayList<String> arr =new ArrayList<String>();
//	일차원 배열 진입
	for(int i=0; i<picture.length; i++) {
//		배열 쪼개기
		line = picture[i].split("");
		
//		문제점 한번반복시 1>2 근데 그 다음이 >또 두번되서 4가 된다. 3이되게 한번만 더해야 한다. >> for 반복문의 순환 문자열 덧셈 문제 cnt를 수정하든지 해야한다.
//		문자열 증식(k--하며 반복)
		
			String tmp ="";
//			각 글자를 증식 (수정해야 함, k만큼 반복하도록)
			for(int j=0;j<line.length;j++) {
//				각 문자열을 part에 답는다.
				String part = line[j];
//				part에 한번 더 더한다. << 여길 수정해야함 반복문안에서 한번에 처리할 수 있도록
				for(int z =1; z<k;z++) {
					line[j] += part;
					System.out.println(line[j]);
				}
			}
			cnt--;
			//꺼내기 전에 string[] 배열을 문자열에 합친다.
		
				for(String x : line) tmp  += x;
				 
			
				//인덱스 증식
			for(int z = 0; z<k; z++) {
			arr.add(tmp);
			}
			
			
		
		cnt=k;
		
	}
	
	String[] answer = new String[picture.length*k];
	for(int t=0; t<arr.size(); t++) {
		answer[t]= arr.get(t);
	}
        return answer;
    }
}