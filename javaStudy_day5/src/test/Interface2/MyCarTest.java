package test.Interface2;

public class MyCarTest {

	public static void main(String[] args) {
		Calculator cal = new MyCal();
		cal.plus(3, 4);
		cal.exec(5, 6);
		
		int i = cal.exec(5,6);
		System.out.println(i);
		
//		static 메소드 호출 --> 인터페이스명.메소드명();
		System.out.println(Calculator.exec2(3,4));
		

	}

}
