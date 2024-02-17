package polymorphism;

public class Arith extends SimpleMath {
	int a=0,b=0;
	String name;
// Constructor overload(Different argument,same method name and same class name)
	public Arith(int a ,int b) {
		super(a,b); //new SimpleMath(a,b)
		this.a=a;
		this.b=b;
	}
	
// Method Overload(Different argument and same method name)
	public int add(int a,int b) {
		return a+b;
	}
	@Override
	public int add() {
		super.add();
		return a+b+b;
	}
}	