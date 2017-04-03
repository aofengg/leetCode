public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
		for(int i = 0; i < nums1.length; i++) {
			list.add(nums1[i]);
		}
		for(int i = 0; i < nums2.length; i++) {
			list.add(nums2[i]);
		}
		Collections.sort(list);
		int length = list.size();
		if(length % 2 == 0) {
			return ((double)(list.get(length/2-1) + list.get(length/2))) / 2;
		} else {
			return (double)list.get(length/2);
		}
    }
}