package LinkedList;

public class FlattenLinkedList {
	public SpecialListNode flattenLinkedList(SpecialListNode head) {
		if(head==null) {
			return head;
		}

		SpecialListNode i=head;
		SpecialListNode j=head;

		while (true) {
			while (j.next!=null) {
				j=j.next;
			}
			if(i.child!=null) {
				j.next=i.child;
			}
			i=i.next;
			if(i==null) {
				break;
			}
		}
		return head;
	}
}
