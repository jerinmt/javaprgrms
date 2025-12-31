import java.util.Scanner;

public class PatternPrinter {
	
	public static void main(String[] args) {
		System.out.println("Enter the number of rows");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		for(int i = 0; i <= num; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
