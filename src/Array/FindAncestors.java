package Array;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/13/13
 * Time: 11:46 AM
 * To change this template use File | Settings | File Templates.
 */

class Node {
	public int data;
	public Node left;
	public Node right;
}
public class FindAncestors {
	public ArrayList<Node> findAncestors(Node root,Node target) {
		ArrayList<Node> list=new ArrayList<Node>();
		if(root!=null && target!=null) {
			findAncestorsUtil(root, target, list);
		}
		if(list.size()==0) {
			return null;
		}
		return list;
	}

	private void findAncestorsUtil(Node root, Node target, ArrayList<Node> list) {
		if(root==null) {
			return;
		}

		if(root.left==target || root.right==target) {
			list.add(root);
			return;
		}

		findAncestorsUtil(root.left, target, list);
		findAncestorsUtil(root.right, target, list);
		if(list.size()>0) {
			list.add(root);
		}
	}
}
