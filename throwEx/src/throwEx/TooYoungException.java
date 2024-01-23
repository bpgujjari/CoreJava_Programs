package throwEx;
 class TooYoungException  extends RuntimeException
{
	TooYoungException (String msg){
		super(msg);
	}
}

 class TooOldException  extends RuntimeException
{
	TooOldException (String msg){
		super(msg);
	}
	
}
public class ThrowEx {
public static void status(int age) {

if(age>35)
{
	System.out.println("Go and marry...");
}
else if(age<18)
	{
		System.out.println("Pilla bacha.....");
	}
else
	{throw new TooOldException("your age is over goo.. bye");
	
	}
}
public static void main(String[] args) {
	ThrowEx.status(28);
}
}
