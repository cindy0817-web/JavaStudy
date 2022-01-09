package MethodOveloading;

public class RunCar {
	public static void main(String args[]) {
		Car c1 = new Car();
		Car c2 = new Car("소방차");
		Car c3 = new Car("구급차", 1234);
		
		System.out.println(c1.getName() + " " + c1.getNumber());
		System.out.println(c2.getName() + " " + c2.getNumber());
		System.out.println(c3.getName() + " " + c3.getNumber());
	}
}
