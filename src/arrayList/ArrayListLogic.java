package arrayList;

import java.util.ArrayList;

public class ArrayListLogic{
	ArrayList<Integer>array;
	public ArrayListLogic(ArrayList<Integer>arr) {
		array = arr;
	}
	public ArrayList<Integer> oddArray() {
		return oddEven(true);
	}
	public ArrayList<Integer> evenArray() {
		return oddEven(false);
	}
	public ArrayList<Integer> oddEven(Boolean isOdd) {
		ArrayList<Integer>res = new ArrayList<Integer>();
		for (int i=0;i<res.size();i++) {
			if(oddOrEven(array.get(i))&& isOdd) {
				res.add(array.get(i));
			}
			else if (!isOdd && !oddOrEven(array.get(i)) ){
				res.add(array.get(i));
				}
		}
		return res;
	}
	private boolean oddOrEven(Integer val) {
		if((val%2) == 1) {
		return true;
	}
	return false;
}
}

