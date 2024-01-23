package collection2;

import java.util.ArrayList;

public class Collecton2 {
public static void main(String[] args) {
	ArrayList<Book> book= new ArrayList<Book>();
	book.add(new Book(100, "Book1", "author1"));
	book.add(new Book(101,"Book2","author2"));
	book.add(new Book(102, "book3", "author3"));
	book.add(new Book(103, "book4", "author4"));

	Book b=book.get(1);
	System.out.println(b.bid+"--"+b.bname+"--"+b.bauthor);
	
	for(Book b1:book)
	{
		System.out.println(b1.bid+b1.bname+b1.bauthor);
	}
}
}
