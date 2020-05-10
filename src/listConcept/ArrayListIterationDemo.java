package listConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> book = new ArrayList<String>();
		book.add("book1");
		book.add("book2");
		book.add("book3");
		book.add("book4");
		book.add("book5");
		
		//using java 8  with forEach and lambda 
		
		book.forEach(chapters ->{
			System.out.println(chapters);
		});
		
		System.out.println(".....................");
		
		//Iterator
		Iterator<String> it = book.iterator();
		while(it.hasNext()) {
			String chapter = it.next();
			System.out.println(chapter);
		}
		
		//forEachRemaining
		System.out.println(".....................");
		it = book.iterator();
		it.forEachRemaining(chapters ->{
			System.out.println(chapters);
		});
		System.out.println(".........for each............");
		//foreach loop
		for(String Chapters: book) {
			System.out.println(Chapters);
		}
		
		//for loop
		System.out.println(".........for loop............");
		for(int i=0; i<book.size(); i++) {
			System.out.println(book.get(i));
		}
//listIterator 
		System.out.println(".........listIterator............");
		ListIterator<String> listit = book.listIterator(book.size());
		while(listit.hasPrevious()) {//retrun in previous order
			System.out.println(listit.previous());
		}
	}

}
