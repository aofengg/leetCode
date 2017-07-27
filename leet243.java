public class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int res = Integer.MAX_VALUE;;
		int index1 = 0;
		int index2 = 0;
		while(index1 < words.length) {
			if(words[index1].equals(word1)) {
				while(index2 < words.length) {
					if(index2 > index1 && words[index2].equals(word2)) {
						int diff = Math.abs(index1 - index2);
						res = res <  diff ? res : diff;
						break;
					} else if(words[index2].equals(word2)) {
						int diff = Math.abs(index1 - index2);
						res = res <  diff ? res : diff;
						index2++;
					} else {
						index2++;
					}
					
				}
			}
			index1++;
		}
		return res;
    }
}