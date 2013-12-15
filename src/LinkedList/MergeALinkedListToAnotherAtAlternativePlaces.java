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
