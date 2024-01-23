package collections4;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test {
public static void main(String[] args) {
	Vector<Book> books= new Vector<Book>();
	books.add(new Book(100, "corejava", "rathansir"));
	books.add(new Book(101, "adv java", "dhoni"));
	books.add(new Book(102, "spring", "virat"));
	books.add(new Book(103, "SpringBoot", "rohit"));
	System.out.println("proecessing the data using ListIterator");
	ListIterator<Book> litr = books.listIterator();
	books.add(new Book(106, "Microservices", "surya"));
	while(litr.hasNext())
	{
		Book book =litr.next();
		if(book.bname.equals("spring"))
			litr.remove();
	}
	System.out.println("proecessing the data using ******Iterator");

	Iterator<Book> itr=books.iterator();
	while(itr.hasNext())
	{
		Book book =itr.next();
		if(book.bid==101)
			itr.remove();
	}
	
	System.out.println("proecessing the data using Enumeration");
	Enumeration<Book> etr=books.elements();
	while(etr.hasMoreElements())
	{
		Book book =etr.nextElement();
		System.out.println(book.bid+"  "+book.bname+"  "+book.author);
	}
	}
}
