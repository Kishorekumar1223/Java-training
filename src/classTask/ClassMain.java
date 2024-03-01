package classTask;

public class ClassMain {

	public static void main(String[] args) {
		Sum sum = new Sum(3,6);
//		ClassName object name = new Constructor
//		ClassName => always start with Capital letter & camel case
//		objectName = always start with lower case letter & camel case
//		MethodName = always start with lower case letter & camel case
		Integer ans = (int) sum.add(2,4); // NormalMethod(objectname.methodName)
		Float ans1 = Sum.addFloat( 6.5f,7.2f); // StaticMethod(Classname.StaticmethodName)
		System.out.println(ans);
		System.out.println(ans1);
		
		Sum1<Integer, Double>Sum1 = new Sum1<Integer, Double>(2, 13);
		System.out.println(sum.add());
		System.out.println(sum.add(2.3,3.4));
	}

}
