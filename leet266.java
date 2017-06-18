public class Solution {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = 0;
        for(int value : map.values()) {
            if(value % 2 != 0)
                count++;
        }
        if(count > 1)
            return false;
        else
            return true;
    }
}