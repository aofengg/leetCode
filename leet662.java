public int widthOfBinaryTree(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int res = 0;
		Queue<TreeNode> queue = new LinkedList<>();
		ArrayList<Integer> index = new ArrayList<>();
		queue.add(root);
		index.add(0);
		while(!queue.isEmpty()) {
			res = Math.max(res, index.get(index.size() - 1) - index.get(0) + 1);
			int size = queue.size();
			ArrayList<Integer> next = new ArrayList<>();
			for(int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				if(node.left != null) {
					queue.offer(node.left);
					next.add(index.get(i) * 2);
				}
				if(node.right != null) {
					queue.offer(node.right);
					next.add(index.get(i)*2 + 1);
				}
			}
			index = next;
		}
		return res;
	}
