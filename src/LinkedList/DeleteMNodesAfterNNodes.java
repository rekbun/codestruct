/*
http://www.geeksforgeeks.org/delete-n-nodes-after-m-nodes-of-a-linked-list/

Given a linked list and two integers M and N. Traverse the linked list such that you retain M nodes then delete next N nodes,
continue the same till end of the linked list.
 */
package LinkedList;

public class DeleteMNodesAfterNNodes {
	public ListNode deleteMNodesAfterNNodes(ListNode head,int m,int n) {
		if(head==null) {
			return head;
		}
		ListNode cur_node=head;
		while (cur_node!=null) {
			int cnt=0;
			while (cnt++<m-1 && cur_node!=null) {
				cur_node=cur_node.next;
			}
			cnt=0;
			ListNode lastNode=cur_node;
			while (cnt++<=n&& cur_node!=null) {
				cur_node=cur_node.next;
			}
			lastNode.next=cur_node;
		}
		return head;
	}
}
