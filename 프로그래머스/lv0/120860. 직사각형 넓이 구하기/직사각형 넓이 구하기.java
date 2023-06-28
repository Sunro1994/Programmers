
class Solution {
    public long solution(int[][] dots) {
     
    

        // Initialize minimum and maximum x, y values with the first point
        int minX = dots[0][0];
        int maxX = dots[0][0];
        int minY = dots[0][1];
        int maxY = dots[0][1];

        // Find the minimum and maximum x, y values among all points
        for (int i = 1; i < dots.length; i++) {
            int x = dots[i][0];
            int y = dots[i][1];

            if (x < minX) {
                minX = x;
            }
            if (x > maxX) {
                maxX = x;
            }
            if (y < minY) {
                minY = y;
            }
            if (y > maxY) {
                maxY = y;
            }
        }

        // Calculate the width using the minimum and maximum x, y values
        int width = Math.abs(maxX - minX);
        int height = Math.abs(maxY - minY);
        int area = width * height;

      
    


        return area;
    }
}