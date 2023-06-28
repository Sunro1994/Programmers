import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
      
        //현재 위치
        int[] position = {0,0};
        //자동으로 이동하게 할 Hashmap생성
        HashMap<String,Integer> map = new HashMap<>();
        map.put("left",-1);
        map.put("right",+1);
        map.put("up",+1);
        map.put("down",-1);
        //board의 크기내에서 움직여야 한다.
        for(int i=0; i<keyinput.length;i++){
            //좌 이동(범위제한 :0~ 99)
            if(keyinput[i].equals("left")&& position[0]-1 > -1*(board[0]/2)-1) position[0] -= 1;
            if(keyinput[i].equals("right")&& position[0]+1 < board[0]/2+1) position[0] += 1;
            if(keyinput[i].equals("up")&& position[1]+1 < board[1]/2+1) position[1] += 1;    
            if(keyinput[i].equals("down")&& position[1]-1 > -1*(board[1]/2)-1) position[1] -= 1;
        }
        return position;
    }
}