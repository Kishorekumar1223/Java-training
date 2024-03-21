package bst;
public class BSTMain {
	public static void main(String[] args) {
		BSTLogic logic = new BSTLogic();
		
		logic.insert(21);
		logic.insert(10);
		logic.insert(14);
		logic.insert(22);
		logic.insert(30);
		logic.insert(23);
		logic.insert(19);
		logic.insert(28);
		logic.insert(20);
		logic.insert(10);
		logic.insert(18);
		logic.insert(8);
		
		logic.find(21);
		logic.find(6);
		logic.find(8);
	}
}