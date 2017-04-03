public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
		ListNode root = new ListNode(0);
		ListNode temproot = root;
		while (l1 != null || l2 != null || carry != 0) {
			int x = l1 == null ? 0 : l1.val;
			int y = l2 == null ? 0 : l2.val;
			ListNode temp = new ListNode((x + y + carry) % 10);
			carry = (x + y + carry) / 10;
			temproot.next = temp;
			temproot = temproot.next;
			l1 = l1 == null ? null : l1.next;
			l2 = l2 == null ? null : l2.next;
		}
		return root.next;
    }
}