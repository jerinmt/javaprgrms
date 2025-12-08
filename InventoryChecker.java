public class InventoryChecker {

	public static void main(String[] args) {
		String items[] = {"Soap", "Comb", "Salt", "Pepper", "Shampoo"};
		int stock[] = {2, 5, 10, 10, 5};
		int total = 0;
		System.out.println("Stock status");
		for(int i = 0; i < 5; i++) {
			if(stock[i]==0) {
				System.out.println(items[i]+" out of stock");
				total = 0;
				break;
			}
			total += stock[i];
		}
		if(total>0 && total<=50) {
			System.out.println("Low stock");
		}
		if(total>50 && total<=100) {
			System.out.println("Moderate stock");
		}
		if(total>100) {
			System.out.println("Good stock");
		}
	}

}