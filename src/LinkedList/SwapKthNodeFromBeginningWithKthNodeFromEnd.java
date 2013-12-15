/*
http://www.geeksforgeeks.org/swap-kth-node-from-beginning-with-kth-node-from-end-in-a-linked-list/
 */
package LinkedList;

public class SwapKthNodeFromBeginningWithKthNodeFromEnd {
	public ListNode swap(ListNode head,int k) {
		if(head==null||head.next==null) {
			return head;
		}
		int i=0;
		ListNode node1=head;
		if(k==1) {
			while (node1.next!=null) {
				node1=node1.next;
			}
			node1.next.next=head.next;
			head.next=node1.next;
			node1.next=head;
			head=head.next;
			node1.next.next=null;
		}
		while(i++<k-1) {
			node1=node1.next;
		}
		ListNode slow=node1.next;
		ListNode node2=head;
		while (slow!=null&& slow.next!=null) {
			node2=node2.next;
			slow=slow.next;
		}
		ListNode swap=node1.next;
		if(node1!=null &&  node2!=null && node2.next!=null) {
			slow=node2.next.next;
			node2.next.next=swap;
			node1.next=node2.next;
			node2.next=swap;
			swap.next=slow;
		}
		return head;
	}
}
