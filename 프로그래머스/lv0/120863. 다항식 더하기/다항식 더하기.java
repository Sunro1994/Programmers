class Solution {
    public String solution(String polynomial) {
        String[] ex = polynomial.replaceAll(" ", "").split("\\+");
	
	int x = 0;
	int y = 0;
	
	for(int i=0; i<ex.length;i++) {
		//x가 붙어있는 숫자들의 합을 구하기
		String detachX = "";
		if (ex[i].equals("x")) x+=1;
		else if(ex[i].contains("x")) {
			detachX= ex[i].replace("x", "");
			x += Integer.parseInt(detachX);		
			}
		else {y+=Integer.parseInt(ex[i]);}
	}
        
        String result = y==0? x+"x": x==0? y+"" : ""+x+"x + "+y;
        if(x != 0 && result.substring(0,2).equals("1x")) result = result.replace("1x", "x");
        return result;
    }
}