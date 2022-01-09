package EnumExam;

enum Currency implements Runnable{
	DOLLAR(1100){
		public void showCurrency() {
			System.out.printf("달러의 환율은 %d원 입니다.\n", getValue());
		}
		@Override
		public void run() {
			System.out.println("hello i'm run method in DOLLAR");
		}
	}, 
	EURO(1500){
		public void showCurrency() {
			System.out.printf("유로의 환율은 %d원 입니다.\n", getValue());
		}

		@Override
		public void run() {
			System.out.println("hello i'm run method in EURO");
		}
	}, 
	YEN(1000){
		public void showCurrency() {
			System.out.printf("엔화의 환율은 %d원 입니다.\n", getValue());
		}

		@Override
		public void run() {
			System.out.println("hello i'm run method in YEN");
		}
		
	},
	YUAN(150){
		public void showCurrency() {
			System.out.printf("위완화러의 환율은 %d원 입니다.\n", getValue());
		}
		
		@Override
		public void run() {
			System.out.println("hello i'm run method in YUAN");
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
		String tempString = value + "원";
		return tempString;
	}
	
	public void run() {
		System.out.println("hello i'm");
	}
	
	/*
	 * 추상메서드를 사용하면 상수에서 재정의 가능
	 * enum의 확장성 증가
	 * 개발자 실수를 컴파일 시점에서 학인가능
	 */
	public abstract void showCurrency();
}

public class EnumExam2 {
	
	public static void main(String[] args) {
		Currency myCurrency = Currency.DOLLAR;
		myCurrency.showCurrency();
		myCurrency.run();
		
	}
}