/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//翻转单向链表，保存两个指针，pre，next，然后改变current的方向，更新pre和current
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
		while(head != null) {
			ListNode next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
    }
}