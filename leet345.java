public class Solution {
    public String reverseVowels(String s) {
        if(s.length() == 0) return s;
		String vowels = "aeiouAEIOU";
		char[] arr = s.toCharArray();
		int i = 0, j = arr.length - 1;
		while(i < j) {
			while(i < j && !vowels.contains(arr[i] + "")) {
				i++;
			}
			while(i < j && !vowels.contains(arr[j] + "")) {
				j--;
			}
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return String.valueOf(arr);
    }
}