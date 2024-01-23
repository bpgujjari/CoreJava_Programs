package collections3;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashmapex {
public static void main(String[] args) {
	LinkedHashMap<Emp, Book> objs= new LinkedHashMap<Emp, Book>();
	objs.put(new Emp(111,"Rathan",1333), new Book(111,"Vikram","Lokesh"));
	objs.put(new Emp(114,"Anu",9090), new Book(211,"Kaithi","Lokeshkanak"));
	objs.put(new Emp(131,"Rathan3",1330), new Book(112,"Kaithi2","LokeshKanakraj"));
	objs.put(new Emp(211,"Rathan2",13390), new Book(123,"T67","Loki"));

	Set<Emp> emps = objs.keySet();
	for(Emp emp:emps)
	{
		//System.out.println(emp.eid+" "+emp.ename+"  "+emp.sal);
	}
	
	Collection<Book> books = objs.values();
	for(Book book:books)
	{
		//System.out.println(book.bid+"  "+book.bname+"  "+book.author);
	}
		Set<Entry<Emp, Book>> entries = objs.entrySet();
		for(Entry<Emp, Book> entry:entries)
		{
			Emp emp = entry.getKey();
			System.out.println(emp.eid+"  "+emp.ename+"  "+emp.sal+" ");
			Book book=entry.getValue();
			System.out.println(book.bid+"  "+book.bname+" "+book.author);
		}
}
}
