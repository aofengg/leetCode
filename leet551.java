public class Solution {
    public boolean checkRecord(String s) {
        char[] arr = s.toCharArray();
		int countA = 0;
		int countL = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 'A') {
				countA++;
				if(countA > 1) {
					return false;
				}
			}
			
			if(arr[i] == 'L') {
				countL++;
				if(countL > 2) {
					return false;
				}
			} else {
				countL = 0;
			}
		}
		return true;
    }
}