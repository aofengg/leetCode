class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> output;
        int result = 1;
        for(int i = 1; i < nums.size(); i++) {
            if (nums[i] == 0) {
                result = 0;
                break;
            }
            result *= nums[i];
        }
        output.push_back(result);
        for(int i = 0; i < nums.size() - 1; i++) {
            if (result == 0 && nums[i+1] != 0) {
                output.push_back(0);
                continue;
            }
            if (nums[i+1] == 0) {
                result = 1;
                for(int j = 0; j < i+1; j++){
                    if (nums[j] == 0) {
                        result = 0;
                        break;
                    }
                    result *= nums[j];
                }
                for(int j = i+2; j < nums.size(); j++) {
                    if (result == 0) {
                        break;
                    }
                    if (nums[j] == 0) {
                        result = 0;
                        break;
                    }
                    result *= nums[j];
                }
                output.push_back(result);
            }
            else {
                result = result * nums[i] / nums[i+1];
                output.push_back(result);
            }
        }
        return output;
    }
};