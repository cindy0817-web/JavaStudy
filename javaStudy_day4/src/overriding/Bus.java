package overriding;

public class Bus extends Car {
	public void run() {
		super.run();	//�θ��� run()�޼ҵ带 ȣ��
		System.out.println("Bus�� run�޼ҵ�");
	}
}
