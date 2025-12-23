import java.util.Scanner;
import java.util.regex.*;

class MessageChecker {
	String message;
	void getInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter message");
		message = input.nextLine();
		input.close();
	}
	@SuppressWarnings("unchecked")
	void checkNumbers() {		
		Pattern pattern = Pattern.compile(" [1-9][0-9]{9} ");
	    Matcher matcher = pattern.matcher(message);
	    if(!matcher.find()) {
	    	System.out.println("No phone numbers found");
	    } else {
	    	System.out.println("Phone numbers found:");
	    	do {
	    		System.out.println(matcher.group());
	    	} while(matcher.find());
	    }
	}
}
public class ContentManager {

	public static void main(String[] args) {
		MessageChecker m1 = new MessageChecker();
		m1.getInput();
		m1.checkNumbers();
	}

}
