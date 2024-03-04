package linkedList;
public class SingleLinkedList {
	SingleLLNode head = null,tail = null;		
	public void insert(int value) {
		SingleLLNode singleLLNode = new SingleLLNode();
		singleLLNode.setValue(value);
		if(head == null) {
			head = singleLLNode;
			tail = singleLLNode;
		}
		else {
			tail.setNext(singleLLNode); 
			tail = singleLLNode;
		}
	}
	public void mid(int value,int position) {
		SingleLLNode newNode = new SingleLLNode();
		newNode.setValue(value);
		
		if(head == null && position ==0) {
			head = newNode;
			tail = newNode;
		}
		else if (position == 0) {
			newNode.setNext(head);
			head = newNode;
		}
		else {
			int index = 1;
			SingleLLNode curItem = head;
			while(curItem !=null) {
				if(position == index) {
					newNode.setNext(curItem);
					curItem = newNode;
					break;
				}
				curItem = curItem.getNext();
				index++;
			}
			if(index < position) {
				System.out.println("Index out of bound error ");
			}
		}
	}
	public void print() {
		SingleLLNode currentVal = head;
		if(head != null) {
			System.out.println("Print");
		while (currentVal != null) {
			System.out.println(currentVal.getValue());
			currentVal = currentVal.getNext();
		}
	}
		else {
			System.out.println("List is empty");
		}
}
}