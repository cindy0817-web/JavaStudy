package test.Interface;

public class LedExam {

	public static void main(String[] args) {
		TV tv = new LedTV();	//TV(인터페이스)는 타입만
		tv.turnOn();
		tv.changeChannel(8);
		tv.changeVolume(39);
		tv.turnOff();
	}

}
