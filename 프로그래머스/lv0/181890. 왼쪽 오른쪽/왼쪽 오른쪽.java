class Solution {
    public String[] solution(String[] str_list) {

	String str = "";
	for(String i: str_list) str+=i;
	int standardL = str.indexOf("l");
	int standardR = str.indexOf("r");
    
	 String[] result;
	//1. l과r이 존재하고 l이 앞에 있을때
	if(standardR != -1 && standardL != -1 && standardL<standardR) str = str.substring(0,standardL);
	//2. l과r이 존재하고 r이 앞에 있을떄
	else if(standardR != -1 && standardL != -1 && standardR<standardL) str = str.substring(standardR+1,str.length());
	//3. l만 존재한다.
	else if(standardL != -1 && standardR ==-1) str = str.substring(0,standardL);
	//4. r만 존재한다.
	else if(standardR != -1 && standardL == -1) str = str.substring(standardR+1,str.length());
	//5. 둘다 없을때
	else {result = new String[]{}; return result;}
       result = new String[str.length()];

	for(int i=0; i<str.length();i++) {
		result[i] = str.charAt(i)+"";
	}
        return result;
    }
}