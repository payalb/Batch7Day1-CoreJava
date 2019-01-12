package day2;

import java.util.HashSet;
import java.util.Set;
// immutable
final public class PhoneBook {
	
	private int id;
	//Name of the person, phonenumbers
	private Set<Person> people= new HashSet<>();
	private String city;
	
	
	public PhoneBook(int id, Set<Person> people, String city) {
	//	super();
		this.id = id;
		this.people =  new HashSet<>(people);
		this.city = city;
	}

	private void addPerson(Person p){
		people.add(p);
	}

	public int getId() {
		return id;
	}



	public Set<Person> getPeople() {
		return new HashSet<>(people);
	}


	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "PhoneBook [id=" + id + ", people=" + people + ", city=" + city + "]";
	}


}

class Person{
	String name;
	Set<Long> phoneNumbers= new HashSet<>();
	public Person(String name, Set<Long> phoneNumbers) {
		super();
		this.name = name;
		this.phoneNumbers = phoneNumbers;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", phoneNumbers=" + phoneNumbers + "]";
	}
	
	
}


class Demo5{
	public static void main(String[] args) {
		Set<Person> people= new HashSet<>();
		people.add(new Person("Payal", Set.of(9599160595l, 0121_64643463l)));
		PhoneBook obj= new PhoneBook(1, people,"Meerut");
		System.out.println(obj);
		people.add(new Person("Puja", Set.of(374674643l)));
		System.out.println(obj);
		
		Set<Person> set=obj.getPeople();
		set.add(new Person("Ritu", null));
		
		System.out.println(obj);
	}
}