package treeTraversal;
public class DFSLogic {
	DFSNode root;
	public void setRoot(DFSNode root) {
		this.root = root;
	}
	public void preorder(DFSNode child) {
		if(child!=null) {
		System.out.print(child.value);
		preorder(child.left);
		preorder(child.right);
	}
	}
	public void inorder(DFSNode child) {
		if(child!=null) {
		preorder(child.left);
		System.out.print(child.value);
		preorder(child.right);
	}
	}
	public void postorder(DFSNode child) {
		if(child!=null) {
		preorder(child.left);
		preorder(child.right);
		System.out.print(child.value);
	}
	}
}
