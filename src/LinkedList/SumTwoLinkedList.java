package LinkedList;

import java.util.ArrayList;

public class SumTwoLinkedList {
	public ListNode sumList(ListNode l1,ListNode l2) {
		if(l1==null||l2==null) {
			return l1==null?l2:l1;
		}

		int s1=findLength(l1);
		int s2=findLength(l2);

		ArrayList<Integer> carry= new ArrayList<Integer>();
		return findSum(l1,l2,s1,s2,carry);
	}

	private ListNode findSum(ListNode l1, ListNode l2, int s1, int s2,ArrayList<Integer> arrayList) {
		if(s1==0) {
			return null;
		}
		if(s1!=s2) {
			if(s1>s2) {
				ListNode toRet=findSum(l1.next, l2, s1-1, s2,arrayList);
				int sum=(l1.val+arrayList.get(0))%10;
				arrayList.set(0,(l1.val+arrayList.get(0))/10);
				ListNode node =new ListNode(sum);
				node.next=toRet;
				return node;
			}else {
				ListNode toRet=findSum(l1, l2.next, s1, s2-1,arrayList);
				int sum=(l2.val+arrayList.get(0))%10;
				arrayList.set(0,(l2.val+arrayList.get(0))/10);
				ListNode node =new ListNode(sum);
				node.next=toRet;
				return node;
			}
		}else {
			ListNode toRet=findSum(l1.next, l2.next, s1-1, s2-1,arrayList);
			int sum=(l1.val+l2.val+arrayList.get(0))%10;
			arrayList.set(0,(l1.val+l2.val+arrayList.get(0))/10);
			ListNode node =new ListNode(sum);
			node.next=toRet;
			return node;
		}

	}

	private int findLength(ListNode listNode) {
		int len=0;
		while (listNode!=null) {
			listNode=listNode.next;
		}
		return len;
	}
}
