import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Shopkeeper {

	public static void main(String[] args) {
		//initializations
		String[] items = {"Rice", "Sugar", "Oil", "Soap", "Milk"};
		int[] prices = {50, 40, 100, 25, 30};
		int[] quantity = new int[5];
		//showing what is available
		System.out.println("Available items");
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ") " + items[i]);
		}
		//getting quantities
		Scanner input = new Scanner(System.in);
		System.out.println("Enter required quantities");
		int i = 0;
		while(i < 5) {
			try {
				System.out.print(items[i] + "- ");
				quantity[i] = input.nextInt();
				i++;
			}
			catch (Exception e){
				System.out.println("Enter valid quantity!!");
				input.next();//to clear the residual input
			}
		}
		input.close();
		//calculating the total
		totalCalc(prices, quantity);
		//showing time
		LocalDateTime myDateObj = LocalDateTime.now();  
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm");  
	    String formattedDate = myDateObj.format(myFormatObj);  
	    System.out.println("Billed on " + formattedDate);
	}
	public static void totalCalc(int[] prices, int[] quantity) {
		double total = 0.0d;
		for(int i = 0; i < 5; i++) {
			total += prices[i] * quantity[i];
		}
		System.out.println("Total price = Rs." + total);
		if(total > 500) {
			total -= total * 0.1;
			System.out.println("Price after discount = Rs." + total);
		}
	}
}
