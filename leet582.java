// leetcode 582
	public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
		Map<Integer, ArrayList<Integer>> map = new HashMap<>();
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < ppid.size(); i++) {
			map.computeIfAbsent(ppid.get(i), k -> new ArrayList<Integer>()).add(pid.get(i));
		}
		res.add(kill);
		if (!map.containsKey(kill))
			return res;
		Queue<Integer> queue = new LinkedList(map.get(kill));
		while (!queue.isEmpty()) {
			int curr = queue.poll();
			res.add(curr);
			ArrayList<Integer> temp = map.get(curr);
			if (temp != null) {
				for (Integer i : temp) {
					queue.add(i);
				}
			}
		}
		return res;
	}