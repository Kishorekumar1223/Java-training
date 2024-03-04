package arrayList;

import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {
		ArrayList<String>al = new ArrayList<String>();
		al.add("Kishore");
		al.add("venky");
		al.add("Boomer");
		al.add("Bala"); 
		
		ArrayListLogic arrayListLogic = new ArrayListLogic();
		arrayListLogic.print(al);

	}

}
