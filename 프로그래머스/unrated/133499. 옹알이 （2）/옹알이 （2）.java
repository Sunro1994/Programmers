class Solution {
    public int solution(String[] babbling) {
        int answer =0;
	for(int i=0; i<babbling.length;i++) {
		if(babbling[i].contains("ayaaya"+"") || babbling[i].contains("yeye"+"")|| babbling[i].contains("woowoo"+"")||babbling[i].contains("mama"+"")) {
			continue;
		}
		
			
		babbling[i]= 	babbling[i].replace("aya", " ");
		babbling[i]= 	babbling[i].replace("ye", " ");
		babbling[i]= 	babbling[i].replace("woo", " ");
		babbling[i]= 	babbling[i].replace("ma", " ");
		
	}
	for(int i=0; i<babbling.length;i++) {
		babbling[i] = babbling[i].replaceAll(" ", "");
		if(babbling[i].equals("")) answer++;
	}
        return answer;
    }
}