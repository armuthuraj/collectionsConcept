package mapConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {
	public static void main(String[] args) {
		//HashMap is a class implements map interface 
		//extends AbstractMap
		//Contains only unique elements
		//stores key-value pair
		//it may have one null key and multiple null values
		//it maintains no order
		//hashmap is non synchronized  (not thread safe, more than one thread can process the hashmap simultaneous and performance of the map will get increased.for high performance use hashmap
		//hashtable is synchronized and thread safe as only one thread can access the table at a time
		//concurrent modification exception -- fail-fast-condition (multiple thread accessing the hasmap and updating the values)
		//synchronized meaning one by one (HashTable, thread 1 apply lock on the object,  thread 2 cant access it untill t1 release the lock)
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		//Storing Value
		hm.put(1, "selenium");
		hm.put(2, "UFT"); 
		hm.put(3,"postman");
		hm.put(4,"RFT");
		
		
		//Getting value
		System.out.println(hm.get(1));
		//Give null value in case if the key doesn't have any values
		System.out.println(hm.get(5)); //will not give any exception
		
		//print all
		for(Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
		}
		//remove
		hm.remove(3);
		System.out.println(hm); // it will print like {1=selenium, 2=UFT, 4=RFT}
		
		//passing objects
		HashMap<Integer, Student> stu = new HashMap<Integer, Student>();
		
		Student stu1 = new Student("Muthu", 28, "Mech");
		Student stu2 = new Student("Raj", 30, "CSC");
		Student stu3 = new Student("Muthuraj", 29, "EEE");
		stu.put(1, stu1);
		stu.put(2, stu2);
		stu.put(3, stu3);
		
		//traverse the hashMap
		
		for (Entry<Integer, Student> m : stu.entrySet()) {
			int key = m.getKey();
			Student s = m.getValue();
			System.out.println("Employee " + key + " Info:");
			System.out.println(s.name +" "+s.age+" "+s.department);
					
			
		}
		
		
	}

}
