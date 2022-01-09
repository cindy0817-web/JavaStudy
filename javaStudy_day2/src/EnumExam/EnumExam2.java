package EnumExam;

enum Currency{
	DOLLAR, EURO, YEN, YUAN;
}

public class EnumExam2 {
	
	public static void main(String[] args) {
		Currency curCurency = Currency.EURO;
		switch(curCurency) {
		case DOLLAR :
			System.out.println("달러 입니다.");
			break;
		case EURO :
			System.out.println("유로화 입니다.");
			break;
		}
	}
}
