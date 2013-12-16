package LinkedList;

import java.util.List;

public class SerializeAndDeserialize {

/*
 * Given class Node, representing a binary tree, write serialize and deserialize methods.
 * You can assume the comparator is unknown, so node.left.value is not necessarily less
 * than node.value, and same for right.
 */

	class Node {
		public Node left;
		public Node right;
		public int value;
		Node(Integer number) {
			this.value=number;
		}
	}

	/**
	 * @param node The root of the tree to serialize.
	 * @param output The List to write the serialized data to.
	 */
	void serialize(Node node, List<Integer> output) {
		if(node==null) {
			output.add(null);
		}else {
			output.add(node.value);
			serialize(node.left,output);
			serialize(node.right,output);
		}
	}

	/**
	 * @param input The List containing the serialized Node tree.
	 * @return The root of the Node tree in its original state (same parent-child relationships for whole tree).
	 */
	Node deserialize(List<Integer> input) {
		if(input==null||input.size()==0) {
			return null;
		}
		Integer number= input.get(0);
		Node root=null;
		if(number!=null) {
			root=new Node(number);
			input.remove(0);
			root.left=deserialize(input);
			root.right=deserialize(input);
		}
		return root;
	}

}
