package listConcept;

import java.util.*;



public class ArrayListDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static array (draw Back is size was fixed)  e.g int[] a = new int[5];
		//dynamic arrys is "Arraylist"
		
		//1. Can contain duplicate values/elements
		//2. maintains insertion order
		//3. Not Synchronized (meaning not thread safe, hence its slow when compared to other collection)
		//4. allows random access to fetch elements because its store the values based on index
		//5. generic (before Jdk 1.5 it was not available, its available only after jdk 1.5) vs non generic

		ArrayList ar = new ArrayList(); //non generic arrayList
		ar.add(10); //0
		ar.add(20); //1
		ar.add(30);//2
		ar.add(40);//3
		System.out.println(ar.size()); //size of array
		ar.add(50);//4
		ar.add(60);//5
		ar.add(12.33);
		ar.add('c');
		ar.add("test");
		ar.add(true);
		System.out.println(ar.size());
		ar.add(60);//6 //allow duplicate value as well
		System.out.println(ar.get(4)); //get an value from an index
		//print all the values in arrayList :forLoop or iterator 
		for (int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		//primativeType Storage
		ArrayList<Integer> ar1 = new ArrayList<Integer>(); //generic ArrayList, use wrapper class inside <>, allow you to add integer only
		ar1.add(100);
		//nonprimitivetype storage
		ArrayList<String> ar2 = new ArrayList<String>();
		
		//ar1.add('e'); not allowed
		
		
		//Employee class object
		Employee e1 = new Employee("Name1", 45, "Dept1");
		Employee e2 = new Employee("Name2", 55, "Dept2");
		Employee e3 = new Employee("Name3", 46, "Dept3");
		
		//Create array list
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		 
		//iterator to traverse the values, it will not work on the basis of index. hence use while loop	
		Iterator<Employee> it = ar4.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.department);
		}
		
		//addAll()
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("string1");
		ar6.add("string2");
		ar6.add("string3");
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("string4");
		ar7.add("string5");
		ar7.add("string6");
		
		ar6.addAll(ar7);
		
		for(int i=0; i<ar6.size();i++) {
			System.out.println(ar6.get(i));
		}
		
		//removeAll
		ar6.removeAll(ar7);
		for(int i=0; i<ar6.size();i++) {
			System.out.println(ar6.get(i));
		}
		
		//retainAll
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("string1");
		ar8.add("string2");
		ar8.add("string3");
		ArrayList<String> ar9 = new ArrayList<String>();
		ar9.add("string1");
		ar9.add("string5");
		ar9.add("string6");
		
		ar8.retainAll(ar9);
		
		for(int i=0; i<ar8.size();i++) {
			System.out.println(ar8.get(i));
		}
	}	

}
