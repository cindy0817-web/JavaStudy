package Constructor;

public class abc1 {
	int n;
	
	public abc1() {
		this(10);
		this.abc2();
	}
	
	public abc1(int n) {
		this.n = n;
		System.out.println("�ڱ� �ڽ��� ������ ȣ�� " + this.n);
		this.n = 20;
		System.out.println("�ڱ� �ڽ��� ���� ȣ�� "+ this.n);
	}
	
	public void abc2() {
		n = 30;
		System.out.println("�ڱ� �ڽ��� �޼ҵ� ȣ��" + n);
	}
}

