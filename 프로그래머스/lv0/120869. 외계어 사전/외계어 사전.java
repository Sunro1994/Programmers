import java.util.stream.Stream;
class Solution {
    public long solution(String[] spell, String[] dic) {
        int combineSpell = 0;
	int answer =2;
	for(String i : spell) combineSpell += (int)i.charAt(0);
	System.out.println(combineSpell);

	int[] dicToInt = new int[dic.length];
	int sum =0;
	for(int i=0; i<dic.length;i++) {
		for(int j=0; j< dic[i].length();j++) {
			sum += (int)dic[i].charAt(j);
		}
		if(sum==combineSpell) {answer =1; break;}
		else sum =0;
	}
        return answer;
        
        
    }
}