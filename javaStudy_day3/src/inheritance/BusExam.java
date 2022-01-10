package inheritance;

public class BusExam {

	public static void main(String[] args) {
		
		Bus bus = new Bus();
		bus.run();
		bus.ppangppang();
		
		Car car = new Car();
		car.run();
		
//		car.ppangppang();	--> sub class에 있는 메소드 사용 불가
	}

}
