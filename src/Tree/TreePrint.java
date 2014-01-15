/*package Tree;

import java.util.List;

public class TreePrint {
	public void createTree() {

	}

	public void print(MultiChildNode root) {
		if (root == null) {
			return;
		}
		printUtil(root, "", "");
	}

	private void printUtil(MultiChildNode root, String ret) {
		if (root == null) {
			return;
		}
		System.out.println(root.get_operation());
		String left = ret + " ";
		for (int i = 0; i < root.get_children().size(); i++) {
			if (i == 0) {
				System.out.println(left + "|");
			}
			System.out.print(left + "+-");
			if (i < root.get_children().size() - 1) {
				printUtil(root.get_children().get(i), left + "| ");
				System.out.println(left + "|");
			} else {
				printUtil(root.get_children().get(i), left + "  ");
			}
		}
	}


	private void printUtil(MultiChildNode root, String ret, String parentOperation) {
		if (root == null) {
			return;
		}
		boolean rootSame = false;
		String left = ret;
		String penultFor = "";
		String finalFor = "";
		if (parentOperation.equals(root.get_operation())) {
			rootSame = true;
			penultFor = ret;
			finalFor = ret;
		} else {
			System.out.println(root.get_operation());
			left = ret + " ";
			penultFor = left + "| ";
			finalFor = left + "  ";
		}
		for (int i = 0; i < root.get_children().size(); i++) {
			if (i == 0 && !rootSame) {
				System.out.println(left + "|");
			}
			System.out.print(left + "+-");
			if (i < root.get_children().size() - 1) {
				printUtil(root.get_children().get(i), penultFor, root.get_operation());
				System.out.println(left + "|");
			} else {
				printUtil(root.get_children().get(i), finalFor, root.get_operation());
			}
		}
	}

	private MultiChildNode read(String input) {
		if (input.isEmpty()) {
			return null;
		}
		int index = 0;
		while (index < input.length() - 1) {
			boolean isOperation = (index + 3 < input.length())
					&& (input.substring(index, index + 3).equals("AND") || input.substring(index, index + 2).equals("OR"));
//        System.out.println("input string is " + input.substring(index));
			if (isOperation) {
				String operation;
				if (input.substring(index, index + 3).equals("AND")) {
					operation = "AND";
					index += 3;
				} else {
					operation = "OR";
					index += 2;
				}
//            System.out.println("operation is " + operation);
				index++;
				final MultiChildNode left = parse();
//            System.out.println("Left child is " + print(left));
				index++;
				final MultiChildNode right = parse();
//            System.out.println("Right child is " + print(right));
				index++;
				return new MultiChildNode(operation) {{
					addChild(left);
					addChild(right);
				}};
			} else {
				int nextTokenEndPosition = nextTokenEndPosition(index, input);
				String nextToken = (nextTokenEndPosition == -1) ? input : input.substring(index, nextTokenEndPosition);
				index = (nextTokenEndPosition == -1) ? input.length() : nextTokenEndPosition;
//            System.out.println("token is " + nextToken);
				return new MultiChildNode(nextToken);
			}
		}
	}

	public static int nextTokenEndPosition(int index, String input) {
		for (int i = index; i < input.length(); i++) {
			boolean isTokenBreak = input.charAt(i) == '(' || input.charAt(i) == ')' || input.charAt(i) == ',';
			if (isTokenBreak) {
				return i;
			}
		}
		return -1;
	}

}
*/