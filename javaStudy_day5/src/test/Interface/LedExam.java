package test.Interface;

public class LedExam {

	public static void main(String[] args) {
		TV tv = new LedTV();	//TV(�������̽�)�� Ÿ�Ը�
		tv.turnOn();
		tv.changeChannel(8);
		tv.changeVolume(39);
		tv.turnOff();
	}

}
