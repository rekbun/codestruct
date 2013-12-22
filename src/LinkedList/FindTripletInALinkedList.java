/*

http://www.geeksforgeeks.org/find-a-triplet-from-three-linked-lists-with-sum-equal-to-a-given-number/

Find a triplet from three linked lists with sum equal to a given number

Given three linked lists, say a, b and c, find one node from each list such that the sum of the values of the nodes is equal to a given number.
For example, if the three linked lists are 12->6->29, 23->5->8 and 90->20->59, and the given number is 101, the output should be tripel “6 5 90″.
 */

package LinkedList;

public class FindTripletInALinkedList {
	public boolean findTriplet(ListNode l1,ListNode l2,ListNode l3,int val) {
		if(l1==null||l2==null||l3==null) {
			return false;
		}

		l2=QuickSort(l2,true);
		l3=QuickSort(l3,false);
		while (l1!=null) {
			ListNode l4=l2;
			ListNode l5=l3;
			while (l4!=null&&l5!=null ) {
				if(l1.val+l4.val+l5.val==val) {
					return true;
				}
				if(l1.val+l4.val+l5.val>val) {
					l5=l5.next;
				}else {
					l4=l4.next;
				}
			}
			l1=l1.next;
		}
		return false;
	}

	private ListNode QuickSort(ListNode l2, boolean b) {
		if(l2==null) {
			return l2;
		}
		if(b) {
		return QuickSortNow(l2,null, new Compare() {
			@Override
			public boolean compare(ListNode l1,int l2) {
				if(l1.val<l2) {
					return true;
				}else{
					return false;
				}
			}
		});
		}else{
			return QuickSortNow(l2,null,new Compare(){

				@Override
				public boolean compare(ListNode l1, int l2) {
					if(l1.val>l2) {
						return true;
					}else {
						return false;
					}
				}
			});
		}


	}

	private ListNode QuickSortNow(ListNode l2,ListNode end, Compare compare) {
		if(l2==end ||l2.next==end) {
			return l2;
		}

		ListNode pivot=findPartition(l2,end,compare);
		if(pivot==null) {
			return null;
		}
		QuickSortNow(l2,pivot, compare);
		QuickSortNow(pivot.next,end,compare);
		return l2;
	}

	private ListNode findPartition(ListNode l2, ListNode end,Compare compare) {
		if(l2==end||l2.next==end) {
			return l2;
		}

		int pivot=l2.val;
		ListNode i=l2;
		ListNode j=l2;
		while (j!=end) {
			if(compare.compare(j,pivot) && j!=i) {
				i=i.next;
				int val= i.val;
				i.val=j.val;
				j.val=val;
			}
			j=j.next;
		}
		l2.val=i.val;
		i.val=pivot;
		return i;
	}

	public interface Compare {
		boolean compare(ListNode l1,int l2);
	}
}
