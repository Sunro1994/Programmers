class Solution {
    public String solution(String number, int k) {
       char[] charArray = number.toCharArray();

        int len= charArray.length-k;
        String answer="";
        StringBuilder sb = new StringBuilder();

        int start=0;

        for (int i = 0; i < len; i++) {
            char max = '0';
            for (int j = start; j <= i+k; j++) {
                if (charArray[j] > max) {
                    max = charArray[j];
                    start = j+1;
                }
            }
           sb.append(Character.toString(max));
            }
        return sb.toString();
        }
    }
