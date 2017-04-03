public class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null) return 0;
		String[] array = s.split(" ");
		if(array.length == 0) return 0;
		return array[array.length-1].length();
    }
}