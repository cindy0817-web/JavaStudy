package abstract_class;

public abstract class Bird {
//	메소드가 하나라도 추상메소드인 경우 해당 클래스는 추상 클래스이다

	public abstract void sing();	//추상메소드
	
	public void fly() {
		System.out.println("날다.");
	}
}
