import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
       
        lost = IntStream.of(lost).sorted().toArray();
	reserve = IntStream.of(reserve).sorted().toArray();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, 1);
        }

        for (int l : lost) {
            map.put(l, map.get(l) - 1);
        }

        for (int r : reserve) {
            map.put(r, map.get(r) + 1);
        }

        for (int r : reserve) {
            if (map.get(r) == 2) {
                if (r - 1 >= 1 && map.get(r - 1) == 0) {
                    map.put(r - 1, 1);
                    map.put(r, 1);
                } else if (r + 1 <= n && map.get(r + 1) == 0) {
                    map.put(r + 1, 1);
                    map.put(r, 1);
                }
            }
        }

        int answer = (int) map.values().stream().filter(i -> i >= 1).count();
        return answer;
    }
}