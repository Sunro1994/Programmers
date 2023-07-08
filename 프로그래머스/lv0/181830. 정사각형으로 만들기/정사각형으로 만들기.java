class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
	int col = arr[0].length;
	
	if(row > col) {
		col+= row-col;
	}
	if(col>row) row += col-row;
	
	int[][] arr2 = new int[row][col];
	
	for(int i=0; i<arr.length;i++) {
		for(int j=0; j<arr[i].length;j++) {
			arr2[i][j]= arr[i][j];
		}
	}
	
        return arr2;
    }
}