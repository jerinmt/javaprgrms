abstract class User {
	abstract void showMessage();
	public void displayUserType() {
		System.out.println("User type selected");
	}
}
class AdminUser extends User {
	void showMessage() {
		System.out.println("Welcome, Admin");
	}
}
class GuestUser extends User {
	void showMessage() {
		System.out.println("Welcome, Guest");
	}
}
public class UserTest {

	public static void main(String[] args) {
		AdminUser manager = new AdminUser();
		GuestUser jerin = new GuestUser();
		manager.displayUserType();
		manager.showMessage();
		jerin.displayUserType();
		jerin.showMessage();
		

	}

}
