package mapConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Similiar to HASHMAP, BUT ITS SYNCHRONIZED
		//hashtable contains only unique key & value
		//Key -> Object -> hashcode -> value
		//it cant contain any null key or null values
		//perfromance of the application will be slow in case of using multithreading 

		Hashtable ht1 = new Hashtable();
		ht1.put(1, "Value1");
		ht1.put(2, "Value2");
		ht1.put(3, "Value3");
		ht1.put(3, "value3"); //duplicate value can be added but while printing it will ignore the duplicate value
		//ht1.put(null,null); gives null pointer exception
		System.out.println("Value of ht1 :");
		System.out.println(ht1);
		
		//create a clone copy/shallow copy
		Hashtable ht2 = new Hashtable();
		ht2=(Hashtable) ht1.clone(); 
		
		//printing values
		System.out.println("values from ht1" + ht1);
		System.out.println("values from ht2" + ht2);
		
		//clear value
		ht1.clear();
		System.out.println("values from ht1" + ht1);
		System.out.println("values from ht2" + ht2);
		
		
		//contains value
		
		if (ht2.contains("Value1"))
			System.out.println("value found");
		
		//print all the values from hashtable using  -- Enumeration --elements()
		Enumeration e = ht2.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//get all values from hashtable using --entryset()--set of hashtable values
		System.out.println("Print value using entryset");
		
		Set s = ht2.entrySet();
		System.out.println(s);
		
		Hashtable<Integer, String> ht3= new Hashtable<Integer, String>();
		ht3.put(1, "Value1");
		ht3.put(2, "Value2");
		ht3.put(3, "Value3");
		
		//check both the hash table are equals or not
		if (ht3.equals(ht2))
			System.out.println("two hashtables are equal");
		 
		//get key values
		System.out.println(ht3.get(1));
		
		//hashcode (32 bit integer code)
		System.out.println("HashCode values of ht2 " +ht2.hashCode());
	}

}
