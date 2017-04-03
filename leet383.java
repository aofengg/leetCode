public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> note = new HashMap<>();
		HashMap<Character, Integer> maga = new HashMap<>();
		for(int i = 0; i < ransomNote.length(); i++) {
			if(note.containsKey(ransomNote.charAt(i))) {
				note.put(ransomNote.charAt(i), note.get(ransomNote.charAt(i)) + 1);
			} else {
				note.put(ransomNote.charAt(i), 1);
			}
		}
		for(int i = 0; i < magazine.length(); i++) {
			if(maga.containsKey(magazine.charAt(i))) {
				maga.put(magazine.charAt(i), maga.get(magazine.charAt(i)) + 1);
			} else {
				maga.put(magazine.charAt(i), 1);
			}
		}
		for(Character c : note.keySet()) {
			if(!maga.containsKey(c)) {
				return false;
			}
			if(maga.get(c) < note.get(c)) {
				return false;
			}
		}
		return true;
    }
}