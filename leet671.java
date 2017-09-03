public int findSecondMinimumValue(TreeNode root) {
		if (root == null) {
			return -1;
		}
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		dfs(root, set, list);
		if (set.size() == 1) {
			return -1;
		}
		Collections.sort(list);
		return list.get(1);
	}

private void dfs(TreeNode root, Set<Integer> set, List<Integer> list) {
	if (root == null) {
		return;
	}
	if (!set.contains(root.val)) {
		set.add(root.val);
		list.add(root.val);
	}
	dfs(root.left, set, list);
	dfs(root.right, set, list);
}