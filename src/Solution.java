import Array.*;
import LinkedList.*;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/10/13
 * Time: 12:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
	public static void main(String[] args) {
		FindTripletInALinkedList sol=new FindTripletInALinkedList();
		ListNode root=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(6,new ListNode(7)))))));
		ListNode l2=new ListNode(15,new ListNode(3,new ListNode(4)));
		ListNode l3=new ListNode(16,new ListNode(4,new ListNode(2)));
		sol.findTriplet(root,l2,l3,12);
	}
}
