class Solution {
    public int[] solution(String my_string) {
        int[] result = new int[52];
	
	int[] UpArr= new int[26];
	int[] LoArr= new int[26]; 
	for(int i=0;i<my_string.length();i++) {
		if(my_string.charAt(i)-90<=0) UpArr[my_string.charAt(i)-65]++;
		else LoArr[my_string.charAt(i)-97]++;
	}
		
	 System.arraycopy(UpArr, 0, result, 0, 26);
	 System.arraycopy(LoArr, 0, result, 26, 26);
        
        return result;
    }
}