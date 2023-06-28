class Solution {
    public String solution(String[] id_pw, String[][] db) {
       int row =0;
	
	String id = id_pw[0];
	String pw = id_pw[1];
	
	for(int i=0; i<db.length;i++) {
		String isID = db[i][0];
		String isPw = db[i][1];
		if(id.equals(isID)&& pw.equals(isPw)) { row=2; break;}
		else if(id.equals(isID)) {row=1;}
		
	}
	
	String answer = row==0?"fail":row==1?"wrong pw":"login";
        
        return answer;
    }
}