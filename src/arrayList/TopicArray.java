package arrayList;

import java.util.ArrayList;

public class TopicArray {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(23);
		al.add(19);
		al.add(25);
		System.out.println("Print the elements are : ");
		print(al);
		System.out.println("Add an element in specific index : ");
		al.add(1,45);
		print(al);
		System.out.println("Remove an element at specific index : ");
		al.remove(3);
		print(al);
		System.out.println("Remove all : ");
		al.clear();
		al.add(12);
		al.add(23);
		al.add(19);
		al.add(25);
		print(al);
		System.out.println("Is empty check : "+ al.isEmpty());
		System.out.println("Array list size : "+ al.size());
		System.out.println("Find the index of : "+ al.indexOf(19));
		System.out.println("Find the index of : "+ al.indexOf(23));
		
		
		ArrayListLogic logic = new ArrayListLogic(al);
		System.out.println("Odd number : ");
		logic.print(logic.oddArray());
		System.out.println("Even number : ");
		logic.print(logic.evenArray());

	}
	 public static void print(ArrayList<Integer>al) {
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}

}
