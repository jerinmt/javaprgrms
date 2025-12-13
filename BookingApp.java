import java.util.Scanner;

abstract class Ride {
	abstract int calculateFare(int distance);
	void rideType() {
		System.out.println("Generic Ride");
	}
}
class AutoRide extends Ride {
	public int calculateFare(int distance) {
		return distance * 10;
	}
	public void rideType() {
		System.out.println("Auto Ride");
	}
}
class CarRide extends Ride {
	public int calculateFare(int distance) {
		return distance * 20;
	}
	public void rideType() {
		System.out.println("Car Ride");
	}
}
public class BookingApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the ride type? (car/auto):");
		String choice = input.next();
		System.out.print("Enter the distance in kms:");
		int distance = input.nextInt();
		if(distance < 0) {
			distance *= -1;
		}
		if(choice.equalsIgnoreCase("car")) {
			CarRide car = new CarRide();
			car.rideType();
			System.out.println(car.calculateFare(distance));
		}
		if(choice.equalsIgnoreCase("auto")) {
			AutoRide auto = new AutoRide();
			auto.rideType();
			System.out.println(auto.calculateFare(distance));
		}
		input.close();
	}

}
