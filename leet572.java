// leet 572
public boolean isSubtree(TreeNode s, TreeNode t) {
	if(compare(s, t)) return true;
	if(s == null || t == null) return false;
	if(isSubtree(s.left, t))
		return true;
	if(isSubtree(s.right, t))
		return true;
	return false;
	}

public boolean compare(TreeNode a, TreeNode b) {
	if(a == null && b == null) return true;
	if(a == null || b == null) return false;
	if(a.val != b.val) return false;
	return compare(a.left, b.left) && compare(a.right, b.right);
}