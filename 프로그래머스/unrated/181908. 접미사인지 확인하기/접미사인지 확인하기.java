class Solution {
    public int solution(String my_string, String is_suffix) {
        if(is_suffix.length() > my_string.length()) return 0;
        	int n = my_string.substring(my_string.length()-is_suffix.length()).equals(is_suffix)==true? 1 : 0;
	
        return n;
    }
}