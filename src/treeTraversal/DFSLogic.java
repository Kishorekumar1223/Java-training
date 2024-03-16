package treeTraversal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DFSLogic {
	DFSNode root;
	public void setRoot(DFSNode root) {
		this.root = root;
	}
	public void preorder(DFSNode child) {
		if(child!=null) {
		System.out.print(child.value+" ");
		preorder(child.left);
		preorder(child.right);
	}
	}
	public void inorder(DFSNode child) {
		if(child!=null) {
		preorder(child.left);
		System.out.print(child.value+" ");
		preorder(child.right);
	}
	}
	public void postorder(DFSNode child) {
		if(child!=null) {
		preorder(child.left);
		preorder(child.right);
		System.out.print(child.value+" ");
	}
	}
	public int height(DFSNode root,int i) {
		if(root == null) {
			return i;
		}
		int Lh = height(root.left,i+1);
		int Rh = height(root.right,i+1);
		if(Lh<Rh) {
			return Rh;
		}
		else{
			return Lh;
		}
	}
	public void printBFS(DFSNode root) {
		Queue<DFSNode> queue = new LinkedList<DFSNode>();
		queue.offer(root);
		while(queue.size()!=0) {
			DFSNode current = queue.poll();
			System.out.print(current.value+" ");
			
			if(current.left !=null) {
				queue.offer(current.left);
			}
			if(current.right !=null) {
				queue.offer(current.right);
			}
		}
	}
	public DFSNode mirror(DFSNode root) {
		if(root == null) 
			return root;
		
		DFSNode left = mirror(root.left);
		DFSNode right = mirror(root.right);
		if(left!= null || right!= null) {
			root.left =right;
			root.right =left;
		}
			return root;
		}
	
	public int height1(DFSNode root,int i) {
		if(root == null)
			return i;
		
		int left = height(root.left,i);
		int right = height(root.right,i);
		if(left<right) {
			return left+1;
		}
		else {
			return right+1;
		}
	
	}
	public ArrayList<int[]> Width(DFSNode root,ArrayList<int []>width,int level) {
		if(root == null) {
			return width;
		}
		int [] level_size = new int[2];
		level_size[0] = level;
		level_size[1] = 0;	
		if(root.left != null && root.right != null)
			level_size[1]=2;
		else if(root.left != null || root.right != null)
			level_size[1]=1;
		width.add(level_size);
		Width(root.left,width,level +1);
		Width(root.right,width,level +1);
		return width;
	}
	public void pattern(DFSNode)
		int n =height*7;
		int mid =n/2;
		int x =0,y=0;
	}
}
