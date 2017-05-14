// leetcode 581
	public static int findUnsortedSubarray(int[] nums) {
		if (nums.length < 2)
			return 0;
		int[] array = Arrays.copyOf(nums, nums.length);
		Arrays.sort(array);
		int start = 0;
		int end = 0;
		int sign = -1;
		for (int i = 0; i < nums.length; i++) {
			if (array[i] != nums[i]) {
				start = i;
				sign = 0;
				break;
			}
		}
		for (int i = nums.length - 1; i >= 0; i--) {
			if (array[i] != nums[i]) {
				end = i;
				sign = 0;
				break;
			}
		}
		return sign == -1 ? 0 : end - start + 1;
	}