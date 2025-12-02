package javaprograms;

public class Bookstore {

	public static void main(String[] args) {
		int price = 275;
		int quantity = 3;
		double total = price * quantity;
		int discount = 10;
		float newDiscount = discount;
		double amount = total - (total * newDiscount / 100);
		System.out.println("The price of the book : Rs." + price);
		System.out.println("Quantity : " + quantity);
		System.out.println("Total price : Rs." + total);
		System.out.println("Discount applied : " + newDiscount + '%');
		System.out.println("Payable amount : Rs." + amount);
	}

}
