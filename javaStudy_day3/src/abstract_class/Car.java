package abstract_class;

public class Car extends Machine {

	@Override
	public void turnOn() {
		System.out.println("Turn on the car system");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off the car system");
	}
	
}
