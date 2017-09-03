class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m + n];
		int index = 0;
		int im = 0;
		int in = 0;
		while(im < m && in < n) {
			if(nums1[im] < nums2[in]) {
				res[index] = nums1[im];
				index++;
				im++;
			} else {
				res[index] = nums2[in];
				index++;
				in++;
			}
		}
		while(im < m) {
			res[index] = nums1[im];
			index++;
			im++;
		}
		while(in < n) {
			res[index] = nums2[in];
			index++;
			in++;
		}
		for(int i = 0; i < m + n; i++) {
			nums1[i] = res[i];
		}
    }
}