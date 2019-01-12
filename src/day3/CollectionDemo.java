package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {
	public static void main(String[] args) throws InterruptedException {
		
/*		List list= new ArrayList();
		for(int i=0; i<50; i++) {
		list.add(Math.random());
		}
		Thread t1=new Thread(()-> {
		for(Object i: list) {
			System.out.println(i);
			
		}});
		t1.start();
		
		Thread t2=new Thread(()-> {
			for(int i=0; i<2000000; i++) {
				list.add(Math.random());
				
			}});
		t2.start();
		t1.join();
		t2.join();
		System.out.println(list.size());//250
		
		
		//Iterating, modify: wrong: fail fast: flag: ConcurrentModificationException
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		//	list.add(5);
			it.remove();
		}
		*/
		
	/*	List<Integer> l1=Arrays.asList(1,2,3);//array: fixed size but u can modify it
	//	l1.add(3);
		l1.set(2, 4);
		System.out.println(l1);
		
		List l2=List.of(3,2,1,4);//non-modifiable{immutable}
		//l2.set(2, 4);
		Set.of(2,2);
		Map.of(1, "hello", 2, "Hi");
		
		l1.add(1, 20);
		
		//Set: no duplicate values: HashSet(hashing), TreeSet(tree)
		
		Set<Integer> set= new HashSet<>();
		set.add(20);
		set.add(20);
		System.out.println(set.size()); //1
*/		
		Set<Employee> set1= new HashSet<>(); //Does not mantain the insertion order | LinkedHashSet
		Employee e1= new Employee(1, "Payal"); //hashCode(): 
		Employee e2= new Employee(4, "Ritu");//hashCode():  9
		Employee e3= new Employee(3, "Kanika");//hashCode(): 
		Employee e4= new Employee(4, "Ritu");// hashcode(): 09
		set1.add(e1); set1.add(e2); set1.add(e3);set1.add(e4); //id: same 
		System.out.println(set1.size());//4 | 3
		//hashing algorithm:
		
		//
	}
}

class Employee{
	public Employee(int i, String name) {
		this.id= i;
		this.name= name;
	}
	int id;
	String name;
	public String toString() {
		return name + " , "+ id;
	}
}
//Adding elements | get operation
//Iterating: adding the elements: 
//10 :11: new array, copy the elements : 2 threads
//