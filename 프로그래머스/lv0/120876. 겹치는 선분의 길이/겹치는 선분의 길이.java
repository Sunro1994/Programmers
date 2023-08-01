class Solution {
    public int solution(int[][] lines) {
        int result =0;
	int min =lines[0][0];
	int max =lines[0][1];
	
	for(int i=1; i<3 ; i++) {
		for(int j=0; j<2;j++) {
			if(lines[i][j]>max) max = lines[i][j];
			if(lines[i][j]<min) min = lines[i][j];
		}
	}

	int[] arr = new int[max-min+1];
	
	for(int i=0; i<3 ; i++) {
		for(int x= lines[i][0]; x<lines[i][1];x++) {
			if(min<0) arr[x+(min*-1)]++;
			else arr[x-min]++;
		}
	}
int cnt=0;
	for(int i: arr) if(i>=2) cnt++;
    
        return cnt;
    }
}