interface Vehicle {
	public void start();
	public void stop();
}
interface FuelBased {
	public void refuel();
}
class Car implements Vehicle, FuelBased {
	public void start() {
		System.out.println("Car engine started");
	}
	public void stop() {
		System.out.println("Car engine stopped");
	}
	public void refuel() {
		System.out.println("Car is refuelling at the station");
	}
}
class ElectricScooter implements Vehicle {
	public void start() {
		System.out.println("Electric scooter powered on");
	}
	public void stop() {
		System.out.println("Electric scooter powered off");
	}
}

public class RentalSystem {

	public static void main(String[] args) {
		Car contessa = new Car();
		ElectricScooter ather = new ElectricScooter();
		contessa.start();
		contessa.stop();
		contessa.refuel();
		ather.start();
		ather.stop();
	}

}
