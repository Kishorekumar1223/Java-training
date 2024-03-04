package linkedList;

public class SingleLLNode {
		private int value;
		private SingleLLNode next = null;
		private int newNode;
		
		public SingleLLNode getNext() {
			return next;	
		}
		public int getValue() {
			return value;	
		}
		public int getnewNode() {
			return newNode;
		}
		public void  setValue(int value) {
			this.value = value;	
		}
		public void setNext (SingleLLNode next) {
			this.next = next;
		}
		public void setnewNide (int newNode) {
			this.newNode = newNode;
		}
	}
