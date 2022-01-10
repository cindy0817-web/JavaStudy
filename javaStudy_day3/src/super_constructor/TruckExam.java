package super_constructor;

public class TruckExam {

	public static void main(String[] args) {
		Truck t = new Truck();	//Car의 생성자 실행 -> Truck의 생성자 실행
		
		Car c = new Car("구급차");	//Car의 기본생성자만 실행
	}

}
