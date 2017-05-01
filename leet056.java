//56. Merge Intervals

//Solution 1, time complexity optimized
public List<Interval> merge(List<Interval> intervals){
	if(intervals.size() < 2) return intervals;
	List<Interval> res = new ArrayList<>();
	intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
	int start = intervals.get(0).start;
	int end = intervals.get(0).end;
	for(Interval interval : intervals) {
		if(interval.start <= end) {
			end = Math.max(end, interval.end);
		} else {
			res.add(new Interval(start,end));
			start = interval.start;
			end = interval.end;
		}
	}
	res.add(new Interval(start, end));
	return res;
}
	
//Solution 2, space complexity optimized
public List<Interval> merge(List<Interval> intervals){
    if(intervals.size() < 2) return intervals;
	intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
	for(int i = 1; i < intervals.size(); i++) {
		if(intervals.get(i).start <= intervals.get(i-1).end) {
			int end = Math.max(intervals.get(i).end, intervals.get(i-1).end);
			intervals.add(i-1, new Interval(intervals.get(i-1).start, end));
			intervals.remove(i);
			intervals.remove(i);
			i--;
		}
	}
	return intervals;
}


public class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}
	Interval(int s, int e) {
		start = s;
		end = e;
	}
}