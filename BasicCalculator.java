import java.util.Scanner;

class Calculator {
	double add(double a, double b) {
		return a + b;
	}
	double subtract(double a, double b) {
		return a - b;
	}
	double multiply(double a, double b) {
		return a * b;
	}
	double divide(double a, double b) {
		return a / b;
	}
}

public class BasicCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean cont = true;
		char choice;
		double first = 0d, second = 0d, result = 0d;
		int operator = 0;
		Calculator c1 = new Calculator();
		
		while(cont) {
			try {
				System.out.println("Enter the first number: ");
				first = input.nextDouble();
				System.out.println("Enter the second number: ");
				second = input.nextDouble();
				System.out.println("Enter the operator: ");
				System.out.println("1) Add 2) Subtract 3) Multiply 4) Divide");
				operator = input.nextInt();
			}
			catch(Exception e) {
				System.out.println("Wrong entry");
				input.next();
				continue;
			}
			switch(operator) {
			case 1:
				result = c1.add(first, second);
				System.out.println("Sum is " + result);
			break;
			case 2:
				result = c1.subtract(first, second);
				System.out.println("Difference is " + result);
			break;
			case 3:
				result = c1.multiply(first, second);
				System.out.println("Product is " + result);
			break;
			case 4:
				if(second==0) {
					System.out.println("Cannot divide by zero");
				} else {
					result = c1.divide(first, second);
					System.out.println("Result is " + result);
				}
			break;
			default: System.out.println("Wrong option");
			}
			System.out.println("Do you want to continue? y/n");
			choice = input.next().charAt(0);
			if(choice == 'y' || choice == 'Y') {
				cont = true;
			} else {
				cont = false;
			}
		}
		input.close();
	}

}
