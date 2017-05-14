/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public int minMeetingRooms(Interval[] intervals) {
        if(intervals == null || intervals.length == 0) {
			return 0;
		}
		Arrays.sort(intervals, (a, b) -> a.start - b.start);
		PriorityQueue<Interval> heap = new PriorityQueue<>(intervals.length, (a, b) -> a.end - b.end);
		heap.offer(intervals[0]);
		for(int i = 1; i < intervals.length; i++) {
			Interval interval = heap.poll();
            if (intervals[i].start >= interval.end) {
                interval.end = intervals[i].end;
            } else {
                heap.offer(intervals[i]);
            }
            heap.offer(interval);
		}
		return heap.size();
		
		/* Actually the priorityqueue containing end index is enough
		PriorityQueue<Integer> ends = new PriorityQueue<Integer>();
    	ends.offer(intervals[0].end);
    	for (int i = 1; i < intervals.length; i++) {
    		if (intervals[i].start >= ends.peek()) { // no overlap, then should update smallest end.
    			ends.poll();
    		} 
    		ends.offer(intervals[i].end);
    	}
    	return ends.size();
		*/
    }
}