public class Solution {
    public String reverseWords(String s) {
		String[] arr = s.split(" ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = reverse(arr[i]);
		}
		StringBuilder sb = new StringBuilder(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			sb.append(" ");
			sb.append(arr[i]);
		}
		return sb.toString();
	}

	private String reverse(String e) {
		StringBuilder sb = new StringBuilder();
		for(int i = e.length() - 1; i >= 0; i--) {
			sb.append(e.charAt(i));
		}
		return sb.toString();
	}
}