package LinkedList;

public class ListNode {
	int val;
	ListNode next;
	public ListNode(int val) {
		this.val=val;
	}
	public ListNode(int val, ListNode node) {
		this.val=val;
		next=node;
	}
}
