public TreeNode trimBST(TreeNode root, int L, int R) {
		if (root == null) {
			return null;
		}
		TreeNode res = findRoot(root, L, R);
		trimleft(res, L);
		trimright(res, R);
		return res;
	}

private void trimright(TreeNode res, int r) {
	if (res.right == null) {
		return;
	}
	if (res.right.val <= r) {
		trimright(res.right, r);
	} else {
		if (res.right.left == null) {
			res.right = null;
		} else if (res.right.left.val < r) {
			res.right = res.right.left;
			trimright(res.right, r);
		} else {
			res.right = res.right.left;
			trimright(res, r);
		}
	}
}

private void trimleft(TreeNode res, int l) {
	if (res.left == null) {
		return;
	}
	if (res.left.val >= l) {
		trimleft(res.left, l);
	} else {
		if (res.left.right == null) {
			res.left = null;
		} else if (res.left.right.val > l) {
			res.left = res.left.right;
			trimleft(res.left, l);
		} else {
			res.left = res.left.right;
			trimleft(res, l);
		}
	}
}

private TreeNode findRoot(TreeNode root, int l, int r) {
	if (l <= root.val && root.val <= r) {
		return root;
	} else if (root.val > r) {
		return findRoot(root.left, l, r);
	} else {
		return findRoot(root.right, l, r);
	}
}