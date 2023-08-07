class Solution {
    public int solution(String[] babbling) {
        int answer =0;
	for(int i=0; i<babbling.length;i++) {
		if(babbling[i].contains("ayaaya"+"") || babbling[i].contains("yeye"+"")|| babbling[i].contains("woowoo"+"")||babbling[i].contains("mama"+"")) {
			continue;
		}
		for(int j=0; j<50;j++) {
			
		babbling[i]= 	babbling[i].replaceFirst("aya", " ");
		babbling[i]= 	babbling[i].replaceFirst("ye", " ");
		babbling[i]= 	babbling[i].replaceFirst("woo", " ");
		babbling[i]= 	babbling[i].replaceFirst("ma", " ");
		}
	}
	for(int i=0; i<babbling.length;i++) {
		babbling[i] = babbling[i].replaceAll(" ", "");
		if(babbling[i].equals("")) answer++;
	}
        return answer;
    }
}