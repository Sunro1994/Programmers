import java.util.*;

class Solution {
   public int[] solution(int[] arr, int[][] intervals) {
        int length = 0;
        // 범위의 개수를 먼저 더해서 배열의 크기를 알아낸다
        for (int i = 0; i < intervals.length; i++) {
            int[] group = intervals[i];
            length += group[1] - group[0] + 1;
        }
        
        int[] answer = new int[length];
        int index = 0;
        // 범위에 맞는 데이터를 가져와서 증가되는 인덱스에 입력해준다
        for (int i = 0;i < intervals.length; i++) {
            int[] group = intervals[i];
            for (int j = group[0]; j <= group[1]; j++) {
                answer[index++] = arr[j]; 
            } 
        }
        return answer;
    }
}