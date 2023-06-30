class Solution {
    public int solution(int chicken) {
    int answer =0;
	//남은 쿠폰
	int restC = 0;
	
	while(chicken >9) {
		answer += (chicken/10);								//199
		 restC = (chicken%10);									//9
		 chicken /= 10;
		 chicken += restC;
		 System.out.println(chicken);
	}
        return answer+(restC/10);
    }
}