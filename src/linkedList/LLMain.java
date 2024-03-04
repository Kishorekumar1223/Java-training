package linkedList;
public class LLMain {
	public static void main(String[] args) {
		System.out.println("Array elements are : ");
		SingleLinkedList sl = new SingleLinkedList();
		sl.insert(5);
		sl.insert(3);
		sl.insert(6);
		sl.insert(9);
		sl.insert(4);
		sl.insert(21,3);
		sl.insert(2);
		sl.print();
	}

}
