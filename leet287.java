public class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
        slow = 0;
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
//     public int findDuplicate(int[] nums) {
//         for(int i = 0; i < nums.length - 1; i++) {
//          for(int j = i+1; j < nums.length; j++) {
//              if(nums[j] == nums[i]) return nums[j];
//          }
//      }
//      return 0;
//     }
}