package super_constructor;

public class Truck extends Car {
	public Truck() {
		super("소방차");	//따로 적지않아도 자동생성
		System.out.println("Truck의 기본 생성자 입니다.");
	}
}
