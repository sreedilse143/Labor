package javaAdvanced;
import static java.lang.System.out;

public class LambdaHello {

	final static String salutation = "Hello! ";

	public static void main(String args[]) {
		GreetingService greetService1 = message -> out.println(salutation + message);
		greetService1.sayMessage("Mahesh");
	}

	interface GreetingService {
		void sayMessage(String message);
	}

}
