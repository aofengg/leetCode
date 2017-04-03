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
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() < 2) {
			return intervals;
		}
		List<Interval> res = new ArrayList<>(intervals);
		Collections.sort(res, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				if (o1.start != o2.start)
					return o1.start - o2.start;
				else
					return o1.end - o2.end;
			}
		});
		for (int i = 1; i < res.size(); i++) {
			if (res.get(i).start == res.get(i - 1).start
					|| res.get(i).start > res.get(i - 1).start && res.get(i).start <= res.get(i - 1).end) {
				if (res.get(i).end <= res.get(i - 1).end) {
					res.remove(i);
					i--;
					continue;
				} else {
					Interval temp = new Interval(res.get(i - 1).start, res.get(i).end);
					res.remove(i);
					res.remove(i-1);
					res.add(i - 1, temp);
					i--;
					continue;
				}
			}
		}
		return res;
    }
}