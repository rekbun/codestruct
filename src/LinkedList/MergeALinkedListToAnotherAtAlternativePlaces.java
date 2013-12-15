/*
http://www.geeksforgeeks.org/merge-a-linked-list-into-another-linked-list-at-alternate-positions/

Merge a linked list into another linked list at alternate positions

Given two linked lists, insert nodes of second list into first list at alternate positions of first list.
For example, if first list is 5->7->17->13->11 and second is 12->10->2->4->6, the first list should become 5->12->7->10->17->2->13->4->11->6 and second list should become empty. The nodes of second list should only be inserted when there are positions available. For example, if the first list is 1->2->3 and second list is 4->5->6->7->8, then first list should become 1->4->2->5->3->6 and second list to 7->8.

Use of extra space is not allowed (Not allowed to create additional nodes), i.e., insertion must be done in-place. Expected time complexity is O(n) where n is number of nodes in first list.



 */


package LinkedList;


public class MergeALinkedListToAnotherAtAlternativePlaces {
	public ListNode merge(ListNode l,ListNode r) {
		if(l==null || r==null) {
			return l==null?r : l;
		}

		ListNode ret=l;
		ListNode cur_node=ret;
		l=l.next;
		while(l!=null) {
			if(r!=null) {
				cur_node.next=r;
				cur_node=cur_node.next;
				r=r.next;
			}
			cur_node.next=l;
			l=l.next;
			cur_node=cur_node.next;
		}
		return ret;
	}
}
