import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        
        array = Arrays.stream(array).distinct().sorted().toArray();
		int min = array[0];
		for(int i=0; i<array.length;i++) {
			if(array[i]==n) {min = array[i]; break;}
			if(Math.abs(array[i]-n)==Math.abs(min-n)) min = Math.min(array[i], min);
			else if (Math.abs(array[i]-n)<Math.abs(min-n)) min = array[i];
		}
        
        return min;
    }
}

