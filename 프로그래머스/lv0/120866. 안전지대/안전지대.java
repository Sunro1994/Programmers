class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int len = board.length+2;
	
        int[][] arr = new int[len][len];
        
        for(int i=0; i<board.length;i++) {
		for(int j=0; j<board[i].length; j++) {
			if(board[i][j]==1) arr[i+1][j+1]=1;
		}
	}
        
        for(int i=0; i<arr.length;i++) {
		for(int j=0 ; j<arr[i].length ; j++) {
			if(arr[i][j]==1) {
				for(int x = i-1; x<=i+1; x++) {
					for(int z= j-1; z<=j+1; z++) {
						if(arr[x][z]!=1) {
							arr[x][z] =2;
//							System.out.println("x :" + x + " z" + z);
						}
					}
				}
			}//if
		}
	}

    int cnt=0;
	for(int i=1; i<arr.length-1;i++) {
		for(int j=1; j<arr.length-1;j++) {
			if(arr[i][j]==0) cnt++; 
		}
	}
                
        return cnt;
    }
}