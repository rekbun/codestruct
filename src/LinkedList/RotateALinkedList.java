package LinkedList;

public class RotateALinkedList {
	public ListNode rotate(ListNode head, int cnt) {
		if (head == null) {
			return head;
		}

		ListNode i = head;
		while (i.next != null) {
			i = i.next;
		}

		while (cnt-- > 0) {
			i.next = head;
			i = i.next;
			i.next = null;
			head = head.next;
		}
		return head;
	}
}
