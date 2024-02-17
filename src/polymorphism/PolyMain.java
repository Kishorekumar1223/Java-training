package polymorphism;

public class PolyMain {

	public static void main(String[] args) {
		Arith arith1=new Arith(34, 66);
		Arith arith=new Arith ("Kishorekumar");
		System.out.println(arith1.getC());
		System.out.println(arith1.add());
		System.out.println(arith1.add(23,56));

	}

}
