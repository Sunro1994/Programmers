import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
       int[] sortedArray = Arrays.stream(numlist)
                .boxed() // Convert to Integer stream
                .sorted((a, b) -> {
                    int distanceA = Math.abs(a - n);
                    int distanceB = Math.abs(b - n);
                    if (distanceA == distanceB) {
                        return b - a; // Sort by descending order if distances are equal
                    }
                    return distanceA - distanceB; // Sort by distance from n
                })
                .mapToInt(Integer::intValue)
                .toArray();
        
        return sortedArray;
    }
}