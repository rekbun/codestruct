/*
      http://www.geeksforgeeks.org/union-and-intersection-of-two-linked-lists/
Union and Intersection of two Linked Lists

Given two Linked Lists, create union and intersection lists that contain union and intersection of the elements present in the given lists. Order of elments in output lists doesn’t matter.
 */
package LinkedList;

public class UnionLinkedList {

	public ListNode union(ListNode head1, ListNode head2) {
		if (head1 == null || head2 == null) {
			return null;
		}
		quickSort(head1, null);
		quickSort(head2, null);

		return mergeUnique(head1, head2);
	}

	private ListNode mergeUnique(ListNode head1, ListNode head2) {
		ListNode ret = new ListNode(-1);
		ListNode head = ret;
		while (head1 != null || head2 != null) {
			if (head1 != null && head2 != null) {
				if (head1.val == head2.val) {
					ret.next = new ListNode(head1.val);
					head1 = head1.next;
					head2 = head2.next;
				} else if (head1.val < head2.val) {
					ret.next = new ListNode(head1.val);
					head1 = head1.next;
				} else {
					ret.next = new ListNode(head2.val);
					head2 = head2.next;
				}
			} else {
				if (head1 != null) {
					ret.next = new ListNode(head1.val);
					head1 = head1.next;
				} else {
					ret.next = new ListNode(head2.val);
					head2 = head2.next;
				}
			}
			ret = ret.next;
		}
		return head.next;
	}

	private void quickSort(ListNode head, ListNode end) {
		if (head == end || head == null) {
			return;
		}

		ListNode mid = partition(head, end);
		quickSort(head, mid);
		quickSort(mid.next, end);
	}

	private ListNode partition(ListNode head, ListNode end) {
		int pivot = head.val;
		ListNode i = head;
		ListNode j = head;

		while (j != end) {
			if (j.val < pivot && j != head) {
				i = i.next;
				int val = j.val;
				j.val = i.val;
				i.val = val;
			}
		}

		head.val = i.val;
		i.val = pivot;
		return i;
	}
}
