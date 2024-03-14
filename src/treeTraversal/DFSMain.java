package treeTraversal;

import java.util.ArrayList;

public class DFSMain {
	public static void main(String[] args) {
		DFSNode root = new DFSNode(11);
		root.left= new DFSNode(2);
		root.right= new DFSNode(8);
		root.left.left = new DFSNode(6);
		root.left.right = new DFSNode(21);
		root.left.left.left = new DFSNode(4);
		root.left.left.right = new DFSNode(7);
		root.left.right.right = new DFSNode(8);
		root.right.left = new DFSNode(3);
		root.right.right = new DFSNode(7);
		root.right.left.right = new DFSNode(14);
		root.right.right.left = new DFSNode(29);
		root.right.right.left.right = new DFSNode(16);
		
		DFSLogic dfsLogic = new DFSLogic();
		System.out.println("********* PREORDER **********");
		dfsLogic.preorder(root);
		System.out.println();
		System.out.println("********* INORDER **********");
		dfsLogic.inorder(root);
		System.out.println();
		System.out.println("********* POSTORDER **********");
		dfsLogic.postorder(root);
		System.out.println();
		System.out.println("********* HEIGHT **********");
		System.out.println(dfsLogic.height(root,0));
		System.out.println("********* BFS search **********");
		dfsLogic.printBFS(root);
		System.out.println();
		DFSNode mirror = dfsLogic.mirror(root);
		System.out.println("********* BFS Mirror **********");
		dfsLogic.printBFS(root);
		System.out.println();
		System.out.println("********* BFS Height **********");
		System.out.println(dfsLogic.height1(root, 0));
		
		ArrayList<int[]>width = dfsLogic.Width(root, new ArrayList<int[]>(), 0);
		int[] levelBasewidth = new int[dfsLogic.height1(root, 0)+1];
		for (int i=0;i<width.size();i++) {
			int j = width.get(i)[0];
			levelBasewidth[j]= levelBasewidth[j]+width.get(i)[1];
		}
		int maxwidth = 0;
		for (int i =0;i<levelBasewidth.length;i++) {
			if(maxwidth < levelBasewidth[i]) {
			maxwidth = levelBasewidth[i];
		}
	}	
		System.out.println("********* Max Width **********");
		System.out.println("Max width : "+maxwidth);
}
}