import Array.*;
import LinkedList.DeleteMNodesAfterNNodes;
import LinkedList.ListNode;
import LinkedList.RotateALinkedList;
import LinkedList.StackToFindMiddle;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/10/13
 * Time: 12:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
	public static void main(String[] args) {
		RotateALinkedList sol=new RotateALinkedList();
		ListNode root=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(6,new ListNode(7)))))));
		ListNode ret=sol.rotate(root,4);
	}
}
