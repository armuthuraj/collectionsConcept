package listConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		
		//add
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("jmeter");
		ll.add("postman");
		//print
		System.out.println("content of linkedlist:" +ll);
		//addFirst
		ll.addFirst("Muthu");
		//addlast
		ll.addLast("raj");
		System.out.println("content of linkedlist:" +ll);
		//get
		System.out.println(ll.get(0));
		//set
		ll.set(0, "tom" );
		System.out.println(ll.get(0));
		
		//remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkedlist:" +ll);
		
		ll.remove(2);
		System.out.println("content of linkedlist:" +ll);
		
		//for loop
		System.out.println("print using for loop");
		for(int n=0;n<ll.size();n++) {
			System.out.println(ll.get(n));	
			
		}
		//advanced for loop
		System.out.println("print using advnace for loop");
		for(String str : ll) {
			System.out.println(str);	
			
		}
		//iterator
		System.out.println("print using iterator");
		Iterator<String> it = ll.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//while
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
	}

}
