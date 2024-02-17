package inhreitanceHierarchical;

public class Son extends Father{

	int age = 21;
	public Son(String name) {
		super(name); // new Father(name)
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

}
