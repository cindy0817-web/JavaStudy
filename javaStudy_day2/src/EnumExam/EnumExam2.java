package EnumExam;

enum Currency implements Runnable{
	DOLLAR(1100){
		public void showCurrency() {
			System.out.printf("�޷��� ȯ���� %d�� �Դϴ�.", getValue());
		}
		public void run() {
			System.out.println("hello i'm run method in DOLLAR");
		}
	}, 
	EURO(1500){
		public void showCurrency() {
			System.out.printf("������ ȯ���� %d�� �Դϴ�.", getValue());
		}
	}, 
	YEN(1000){
		public void showCurrency() {
			System.out.printf("��ȭ�� ȯ���� %d�� �Դϴ�.", getValue());
		}
	},
	YUAN(150){
		public void showCurrency() {
			System.out.printf("����ȭ���� ȯ���� %d�� �Դϴ�.", getValue());
		}
	};
	
	private int value;
	private Currency(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public String toString() {
		String tempString = value + "��";
		return tempString;
	}
	
	public void run() {
		System.out.println("hello i'm");
	}
	
	/*
	 * �߻�޼��带 ����ϸ� ������� ������ ����
	 * enum�� Ȯ�强 ����
	 * ������ �Ǽ��� ������ �������� ���ΰ���
	 */
	public abstract void showCurrency();
}

public class EnumExam2 {
	
	public static void main(String[] args) {
		Currency myCurrency = Currency.EURO;
		myCurrency.showCurrency();
		
	}
}
