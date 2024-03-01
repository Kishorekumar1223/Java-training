package integer;

public class MathExample {

	public static void main(String[] args) {
		Integer a = 23;
		Integer b= -12;
		Double c = 12.6;
		Double d = 11.2;
		
		System.out.println("Abs : "+ Math.abs(c));
		System.out.println("Abs : "+ Math.abs(b));
		System.out.println("ceil : "+ Math.ceil(c));
		System.out.println("floor : "+ Math.floor(c));
		System.out.println("round : "+ Math.round(c));
		System.out.println("round : "+ Math.round(d));
		System.out.println("sqrt : "+ Math.sqrt(d));
		System.out.println("Max : "+ Math.max(c, a));
		System.out.println("Min : "+ Math.min(c, a));
		System.out.println("Random : "+ Math.random());
		System.out.println("Power of : "+ Math.pow(21, 3));
		System.out.println("Power of : "+ Math.exp(d));
		
		int e = -34;
		int f = 16;
		double g = 37.5;
		double d = 22.3;
		double e = 31.6;
		int f = 99;
		System.out.println( Math.abs(e));
		System.out.println( Math.negateExact(f));
		System.out.println( Math.sqrt(b));
		System.out.println(Math.floor(c)+Math.floor(d)+Math.floor(e)+Math.floor(f));
	}

}
