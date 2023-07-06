import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
      double[] avg = new double[score.length];
	
	//1차원 진입
	for(int i=0; i<score.length;i++) {
		//2차원의 각 요소를 합하여 평균 산출
		avg[i] =(score[i][0]+score[i][1])/(double)2;
	}
	
	//System.out.println("avg : " +Arrays.toString(avg));
	
	
	//역순 정렬
	Double[] avg1 = Arrays.stream(avg).sorted().distinct().boxed().toArray(Double[]::new);
	Arrays.sort(avg1,Collections.reverseOrder());
	//System.out.println("avg1:"+Arrays.toString(avg1));
	
	//정답을 담을 배열
	int[] answer = new int[score.length];
	
	//등수 중복제외 순위매길 숫자
	int cnt =0;
	
	int rank = 1;
	//등수 매기기
	for(int i=0; i<avg1.length; i++) {
		double s= avg1[i];
		for(int j=0; j<avg.length;j++) {
			if(avg[j]==s) {answer[j] = rank; cnt++;}
		}
		rank = cnt+rank;
		cnt=0;
	}
        return answer;
    }
}