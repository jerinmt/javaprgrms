package javaprograms;

public class Billing {

	public static void main(String[] args) {
		String itemName = "Soap";
		byte quantity = 4;
		float price = 18.75f;
		float total = price * quantity;
		System.out.println("Item name :- " + itemName);
		System.out.println("Unit price :- Rs." + price);
		System.out.println("Quantity : " + quantity);
		System.out.println("Total price : Rs." + total);
	}

}
