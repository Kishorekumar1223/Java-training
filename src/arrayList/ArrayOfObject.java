package arrayList;
import java.util.ArrayList;
public class ArrayOfObject {

	public static void main(String[] args) {
		ArrayList<Person> alPerson = new ArrayList<Person>();
		
		Person p1 = new Person("kishore","male",21);
		Person p2 = new Person("bala","male",22);
		Person p3 = new Person("bhanu","Female",20);
		Person p4 = new Person();
		p4.setName("kishore");
		p4.setGender("Male");
		p4.setAge(21);
		
		alPerson.add(p1);
		alPerson.add(p2);
		alPerson.add(p3);
		alPerson.add(p4);
		alPerson.add(new Person("kumari","Female",23));
		
		for (int i = 0; i < alPerson.size();i++) {
			Person person = alPerson.get(i);
			System.out.println("********");
			System.out.println("Name : "+person.getName());
			System.out.println("age : "+person.getAge());
			System.out.println("gender: "+person.getGender());
			
		alPerson.forEach(person ->
			System.out.println("********");
			System.out.println("Name : "+person.getName());
			System.out.println("age : "+person.getAge());
			System.out.println("gender: "+person.getGender());
	
		});
		}
	}
