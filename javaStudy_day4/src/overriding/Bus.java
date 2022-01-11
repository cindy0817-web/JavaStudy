package overriding;

public class Bus extends Car {
	public void run() {
		super.run();	//부모의 run()메소드를 호출
		System.out.println("Bus의 run메소드");
	}
}
