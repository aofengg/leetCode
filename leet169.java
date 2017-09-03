public class Solution {
    public int majorityElement(int[] nums) {
        if(nums == null || nums.length == 0) {
			return 0;
		}
		HashMap<Integer, Integer> hash = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			if(!hash.containsKey(nums[i])) {
				hash.put(nums[i], 1);
			} else {
				hash.put(nums[i], hash.get(nums[i]) + 1);
			}
			if(hash.get(nums[i]) >= ((nums.length+1)/2)){
				return nums[i];
			}
		}
		return 0;
    }
}



// Space O(1) Time O(n) 算法
// 因为major比其他总数还多，所以维护一个常量count对应major，它总会是正数

public class Solution {
public int majorityElement(int[] num) {

int major=num[0], count = 1;
for(int i=1; i<num.length;i++){
if(count==0){
count++;
major=num[i];
}else if(major==num[i]){
count++;
}else count--;

}
return major;
}
}
