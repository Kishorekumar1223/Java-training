package integer;

public class IntegerExample {

	public static void main(String[] args) {
		Integer age = new Integer(21);
		Integer age1 = 20;
		String pincode = "625531";
		Integer pin = Integer.parseInt(pincode);
		String ageStr = age1.toString();
		System.out.println(age1.max(21, 17));
		System.out.println(age1.min(21, 17));
		System.out.println(Integer.sum(12, 23));
		System.out.println(Integer.divideUnsigned(45, 5));
		
		Double d =new Double(21.5);
		Double d1 = 23.4;
		System.out.println(Double.parseDouble(ageStr));
		System.out.println(Double.max(55.5, 2.3));
		System.out.println(Double.min(10.6, 23.5));
		System.out.println(Double.sum(12.5, 23.6));
		String dStr =d.toString();
		System.out.println(dStr);
	}

}
