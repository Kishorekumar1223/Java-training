package linkedList;

public class SingleLLEx2 {

	public static void main(String[] args) {
		SingleLLNode head = null;
		SingleLLNode tail = null;
		SingleLLNode obj = new SingleLLNode();
		obj.setValue(5);
		if(head == null) {
			head = obj;
			tail = obj;
		}
		SingleLLNode obj2 = new SingleLLNode();
		obj2.setValue(12);
		tail.setNext(obj2);
		tail = obj2;
		SingleLLNode obj3 = new SingleLLNode();
		obj3.setValue(23);
		tail.setNext(obj3);
		tail = obj3;
		SingleLLNode obj4 = new SingleLLNode();
		obj4.setValue(2);
		tail.setNext(obj);
		tail = obj3;
		System.out.println(head.getValue());
		System.out.println(head.getNext().getValue());
		System.out.println(head.getNext().getNext().getValue());
	}

}
