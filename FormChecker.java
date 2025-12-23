import java.util.Scanner;
import java.util.regex.*;

class FormBody {
	String name, email, number;
	void getInput() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = input.nextLine();
		System.out.print("Enter email: ");
		email = input.nextLine();
		System.out.print("Enter phone number: ");
		number = input.nextLine();
		input.close();
	}
	void checkFields() {		
		boolean nameCheck, emailCheck, numberCheck;
		nameCheck = Pattern.matches("[A-Z][a-z|\s[A-Z]]*", name);
		if(nameCheck) {
			System.out.println(name + " - valid");
		} else {
			System.out.println(name + " - invalid");
		}
		emailCheck = Pattern.matches("[[a-z]|[0-9]]+@[[a-z]|[0-9]]+.[a-z]+", email);
		if(emailCheck) {
			System.out.println(email + " - valid");
		} else {
			System.out.println(email + " - invalid");
		}
		numberCheck = Pattern.matches("[1-9][0-9]{9}", number);
		if(numberCheck) {
			System.out.println(number + " - valid");
		} else {
			System.out.println(number + " - invalid");
		}
	}
}
public class FormChecker {

	public static void main(String[] args) {
		FormBody m = new FormBody();
		m.getInput();
		m.checkFields();
	}

}
