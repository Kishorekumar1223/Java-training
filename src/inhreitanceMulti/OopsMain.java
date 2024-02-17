package inhreitanceMulti;
import oops.Father;
import oops.Son;
import oops.GrandFather;
public class OopsMain {

	public static void main(String[] args) {
		
		GrandFather grandfather = new GrandFather();
		Father father1 = new Father("Gokul");
		Son son = new Son("Kumar");
		
		father.setName("Kishore");
		
		System.out.println(grandfather.getDob());
		System.out.println(father1.getDob());
		System.out.println(son.getDob());
	}

}
