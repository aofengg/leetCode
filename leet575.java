// leet575
public int distributeCandies(int[] candies) {
	Set<Integer> set = new HashSet();
	for(int i : candies) {
		set.add(i);
	}
	int length = candies.length;
	int kinds = set.size();
	if(kinds <= (length / 2)) {
	return kinds;
	} else{
		return length / 2;
	}
}