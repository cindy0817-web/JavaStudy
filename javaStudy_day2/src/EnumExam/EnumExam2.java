package EnumExam;

enum Currency{
	DOLLAR(1100), EURO(1500), YEN(1000), YUAN(150);
	int value;
	private Currency(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}

public class EnumExam2 {
	
	public static void main(String[] args) {
		Currency curCurency = Currency.EURO;
		switch(curCurency) {
		case DOLLAR :
			System.out.printf("�޷��� ȯ���� %d�Դϴ�.", curCurency.getValue());
			break;
		case EURO :
			System.out.printf("����ȭ�� ȯ���� %d�Դϴ�.", curCurency.getValue());
			break;
		}
	}
}
