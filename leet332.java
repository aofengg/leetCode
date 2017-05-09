public class Solution {
    Map<String, PriorityQueue<String>> targets = new HashMap<>();
	LinkedList<String> res = new LinkedList<>();
	public List<String> findItinerary(String[][] tickets) {
		for(String[] ticket : tickets) {
			targets.computeIfAbsent(ticket[0], k -> new PriorityQueue<String>()).add(ticket[1]);
		}
		visit("JFK");
		return res;
	}
	
	private void visit(String airport) {
		while(targets.containsKey(airport) && !targets.get(airport).isEmpty()) {
			visit(targets.get(airport).poll());
		}
		res.addFirst(airport);
	}
}