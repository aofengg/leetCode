public class Solution {
    public String reverseStr(String s, int k) {
		int i = 0;
		int n = s.length();
		char[] arr = s.toCharArray();
		while(i < n) {
			int j = Math.min(i + k - 1, n - 1);
			swap(arr, i , j);
			i += 2 * k;
		}
		return String.valueOf(arr);
	}
	
	public void swap(char[] nums, int i, int j) {
		while(i < j) {
			char temp = nums[i];
			nums[i++] = nums[j];
			nums[j--] = temp;
		}
	}
}