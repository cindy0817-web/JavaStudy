package MethodOveloading;

public class Car {
	String name;
	int number;
	
	public Car() {
		this("이름없음", 0);
	}

	public Car(String name) {
		this.name  = name;
		number = 0;
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}
}
