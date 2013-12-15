package LinkedList;

public class DLLNode {
	int val;
	DLLNode left;
	DLLNode right;
	public DLLNode(int val) {
		this.val=val;
	}

	public DLLNode(int val,DLLNode node1,DLLNode node2) {
		this.val=val;
		left=node1;
		right=node2;
	}

}
