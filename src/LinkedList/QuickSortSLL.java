/*
http://www.geeksforgeeks.org/quicksort-on-singly-linked-list/
 */

package LinkedList;

public class QuickSortSLL {
	public ListNode quickSortSLL(ListNode head) {
		if(head==null) {
			return null;
		}
		return quickSort(head,null);
	}

	private ListNode quickSort(ListNode head,ListNode end) {
		if(head==null|| head.next==end) {
			return head;
		}
		ListNode i=partition(head,end);
		quickSort(head, i);
		quickSort(i, end);
		return head;
	}

	private ListNode partition(ListNode head,ListNode end) {
		if(head==null || head.next==end) {
			return head;
		}
		int pivot=head.val;
		ListNode i=head;
		ListNode j=head;
		while(j!=end) {
			if(j.val<=pivot) {
				if(j!=head) {
					i=i.next;
					int swap=j.val;
					j.val=i.val;
					i.val=swap;
				}
			}
			j=j.next;
		}
		head.val=i.val;
		i.val=pivot;

		return i.next;
	}
}
