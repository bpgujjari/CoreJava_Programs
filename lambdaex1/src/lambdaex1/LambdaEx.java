package lambdaex1;
@FunctionalInterface
public interface LambdaEx {
void status(int age);
}
class Test{
	public static void main(String[] args) {
		LambdaEx le= (age)->System.out.println("CONGRATULATIONS...");
	}
}

