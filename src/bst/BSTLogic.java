package bst;

public class BSTLogic {
	BSTNode root = null;
	
	public void insert(int value) {
		if(root == null) {
			root = new BSTNode(value);
		}
		else {
		insert(root, value);
		}
	}
	private BSTNode insert(BSTNode currentRoot,int value) {
		if(currentRoot == null) {
			BSTNode newNode = new BSTNode(value);
			return newNode;
		}
		if(value<=currentRoot.value) {
			System.out.println("Parent :"+currentRoot.value+" left :"+value);
			currentRoot.left =  insert(currentRoot.left,value);
		}
		else if (value > currentRoot.value){
			System.out.println("Parent :"+currentRoot.value+" right :"+value);
			currentRoot.right =  insert(currentRoot.right,value);
		}
		return currentRoot;
	}
	public boolean find(int value) {
		if(find(root,value)==null) {
			System.out.println("False value :"+value);
			return false;
		}else {
			System.out.println("True value :"+value);
			return true;
		}
	}
	public BSTNode find(BSTNode currentNode,int value) {
		if(currentNode == null) {
			return null;
		}
		if(currentNode.value == value) {
			return currentNode;
		}
		else if(currentNode.value>value) {
//			System.out.println("left : "+currentNode.value);
			return find(currentNode.left,value);
		}
		else {
			System.out.println("Right : "+currentNode.value);
			return find(currentNode.right, value);
		}
	}
}