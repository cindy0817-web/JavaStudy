package EnumExam;

enum Currency{
	DOLLAR, EURO, YEN, YUAN;
}

public class EnumExam2 {
	
	public static void main(String[] args) {
		Currency curCurency = Currency.EURO;
		switch(curCurency) {
		case DOLLAR :
			System.out.println("�޷� �Դϴ�.");
			break;
		case EURO :
			System.out.println("����ȭ �Դϴ�.");
			break;
		}
	}
}
