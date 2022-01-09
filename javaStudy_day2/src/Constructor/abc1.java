package Constructor;

public class abc1 {
	int n;
	
	public abc1() {
		this(10);
		this.abc2();
	}
	
	public abc1(int n) {
		this.n = n;
		System.out.println("자기 자신의 생성자 호출 " + this.n);
		this.n = 20;
		System.out.println("자기 자신의 변수 호출 "+ this.n);
	}
	
	public void abc2() {
		n = 30;
		System.out.println("자기 자신의 메소드 호출" + n);
	}
}

