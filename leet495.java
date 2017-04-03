public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length == 0) {
            return 0;
        }
        if(timeSeries.length == 1) {
            return duration;
        }
        int res = duration;
        int length = timeSeries.length;
        for(int i = 1; i < length; i++) {
            if((timeSeries[i]-timeSeries[i-1]) >= duration) {
                res += duration;
            } else {
                res += (timeSeries[i]-timeSeries[i-1]);
            }
        }
        return res;
    }
}