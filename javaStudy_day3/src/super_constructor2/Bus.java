package super_constructor2;

public class Bus extends Car {
	int fee;
	
	public Bus(String name, int number, int fee){
		super(name, number);
		this.fee = fee;
	}
}
