package arrayList;
public class Person {
	String name,gender;
	int age;
	
	public Person(String name,String gender,int age) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public int getAge() {
		return age;
	}
	public int getGender() {
		return gender;
	}
	public int getName() {
		return name;
	}
}
