package Tree;

import java.util.ArrayList;
import java.util.List;

public class MultiChildNode {
	String _operation;
	List<MultiChildNode> _children;

	public MultiChildNode(String operation) {
		_operation = operation;
		_children=new ArrayList<MultiChildNode>();
	}

	public void add(MultiChildNode node) {
		_children.add(node);
	}


	public boolean isLeaf() {
		return _children.size() == 0;
	}

	public String get_operation() {
		return _operation;
	}

	public void set_operation(String _operation) {
		this._operation = _operation;
	}

	public List<MultiChildNode> get_children() {
		return _children;
	}


	public void set_children(List<MultiChildNode> _children) {
		this._children = _children;
	}
}
