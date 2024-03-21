package bst;
public class BSTNode {
	int value;
	BSTNode left;
	BSTNode right;
	public BSTNode(int value) {
		this.value = value;
	}
	public BSTNode getLeft() {
		return left;
	}
	public BSTNode getRight() {
		return right;
	}
	public int getValue() {
		return value;
	}
	public void setLeft(BSTNode left) {
		this.left = left;
	}
	public void setRight(BSTNode right) {
		this.right = right;
	}
}
