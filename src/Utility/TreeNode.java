package Utility;

public class TreeNode {


	// not recommended to use public access modifiers for these fields, we want to enhance the encapsulation and
	// abstraction by using private keyword
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode() {
	}

	public TreeNode(int val) {
		this.val = val;
	}

	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
