import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String[] solution(String[] quiz) {
        ArrayList<String> list = new ArrayList<String>();
	String tmp="";//list에 담을 임시 문자열
	int sum = 0;
	//1차원 배열 진입
	for(int i=0; i<quiz.length;i++) {
		String quiz1 = quiz[i];	//i번째 문자열
		String[] arr = quiz1.split("=");
		arr[0] = arr[0].replace(" - ", "!").replaceAll(" \\+ ", "#").replaceAll(" ", "");
		arr[1] = arr[1].replaceAll(" ", "");
		if(arr[0].contains("!")) {
			int a = Integer.parseInt(arr[0].substring(0, arr[0].indexOf("!")));
			int b = Integer.parseInt(arr[0].substring(arr[0].indexOf("!")+1));
//			System.out.println("-가 있을때 :" +a+ "-"+b +"="+ arr[1] );
			if(a-b == Integer.parseInt(arr[1])) list.add("O");
			else list.add("X");
		}
		else {
			int a = Integer.parseInt(arr[0].substring(0, arr[0].indexOf("#")));
			int b = Integer.parseInt(arr[0].substring(arr[0].indexOf("#")+1));
//			System.out.println("+가 있을때 :" +a+ "+"+b +"="+ arr[1] );
			if(a+b == Integer.parseInt(arr[1])) list.add("O");
			else list.add("X");
		}
		}
	String[] answer = new String[quiz.length];
	for(int i=0; i<answer.length;i++) {
		answer[i] = list.get(i);
	}
        return answer;
    }
}


/*

class Solution {
    public String[] solution(String[] quiz) {
        for(int i=0; i<quiz.length; i++){
            String[] text = quiz[i].split(" ");
            int result = Integer.parseInt(text[0]) + ( Integer.parseInt(text[2]) * ( text[1].equals("+") ? 1:-1) );
            quiz[i] = result == Integer.parseInt(text[4])? "O": "X";
        }
        return quiz;
    }
}
*/