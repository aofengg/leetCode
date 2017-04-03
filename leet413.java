public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        if(A.length < 3) {
            return 0;
        }
        int res = 0;
        int lastDiff = 0;
        int diff = 0;
        int count = 0;
        for(int i = 1; i < A.length; i++) {
            diff = A[i] - A[i-1];
            if(diff == lastDiff) {
                count++;
                if(count > 1) {
                    res = res + count - 1;
                }
            } else {
                lastDiff = diff;
                count = 1;
            }
        }
        return res;
    }
}