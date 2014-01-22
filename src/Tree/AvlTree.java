package Tree;

class TreeNode {
	int val;
	int height;
	public TreeNode left;
	public TreeNode right;



	public TreeNode(int val) {
		this.val=val;
	}
}
public class AvlTree {
	private TreeNode root;
	public void insert(int x) {
		root=insertUtil(root,x);
	}

	private TreeNode insertUtil(TreeNode root,int x) {
		if(root==null) {
			return new TreeNode(x);
		}
		if(root.val==x) {
			return root;
		}
		if(root.val<x) {
			root.left=insertUtil(root.left,x);
		}else {
			root.right=insertUtil(root.right, x);
		}

		root.height=Math.max(getHeight(root.left),getHeight(root.right));


		int balance=getBalance(root.left,root.right);

		if(balance>1&& root.left.val>x) {
			return rotateRight(root);
		}
		if(balance<-1  && root.right.val>x) {
			return rotateLeft(root);
		}
		if(balance>1 && root.left.val<x) {
			root.left=rotateRight(root.left);
			return rotateRight(root);
		}
		if(balance<-1 && root.right.val>x) {
			root.right=rotateLeft(root.right);
			return rotateLeft(root);
		}

		return root;

	}

	private TreeNode rotateLeft(TreeNode root) {
		TreeNode x=root.right;
		TreeNode y= root.right.left;

		root.right=y;
		x.left=root;

		root.height=Math.max(getHeight(root.left),getHeight(root.right));
		x.height=Math.max(getHeight(x.left),getHeight(x.right));
		return x;
	}

	private TreeNode rotateRight(TreeNode root) {
		TreeNode x=root.left;
		TreeNode y=root.left.right;

		root.left=y;
		x.right=root;
		root.height=Math.max(getHeight(root.left),getHeight(root.right));
		x.height=Math.max(getHeight(x.left),getHeight(x.right));
		return x;
	}

	private int getHeight(TreeNode left) {
		if(left!=null) {
			return left.height;
		}
		return 0;
	}

	private int getBalance(TreeNode left, TreeNode right) {
		int leftHeight=0;
		int rightHeight=0;
		if(left!=null) {
			leftHeight=left.height;
		}
		if(right!=null) {
			rightHeight=right.height;
		}
		return leftHeight-rightHeight;

	}


}
