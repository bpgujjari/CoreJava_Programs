package java8YoutubeEx;

import java.util.List;
import java.util.stream.Collectors;

public class Java8Youtube {
public static void main(String[] args) {
	List<String> names= List.of("raju","rani","ravi","krishna","devi","king","queen","dayyam","rakesh");
	
	names.stream()
	.filter(name->name.startsWith("k"))
	.forEach(name->System.out.println(name));
	System.out.println("****************");
	
	
	List<String> names1= names.stream()
	.filter(name->name.startsWith("r")&&name.length()==4)
	.collect(Collectors.toList());
	System.out.println(names1);
	
	
	long count=names.stream()
	.filter(name->name.startsWith("r"))
	.count();
	System.out.println(count);
	
	String d= names.stream()
	.filter(name->name.startsWith("d"))
	.skip(1)
	.findFirst()
	.get();
	System.out.println(d);
	
	String n=names.stream()
	.filter(name->name.startsWith("r"))
	.skip(4)
	.findFirst()
	.orElse(null);
	System.out.println(n);
	

}
}
