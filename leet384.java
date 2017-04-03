public class Solution {
    private int[] nums;
    private Random random;
    
    public Solution(int[] nums) {
        this.nums = nums;
        this.random = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(nums == null) {
            return null;
        }
        if(nums.length < 2) {
            return nums;
        }
        int[] temp = nums.clone();
        for(int i = 0; i < nums.length; i++) {
            int j = random.nextInt(i+1);
            swap(temp, i, j);
        }
        return temp;
    }
    
    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */