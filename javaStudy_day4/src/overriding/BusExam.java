package overriding;

public class BusExam {

	public static void main(String[] args) {
		Car car = new Bus();
		car.run();
//		car.ppangppang;	//������ ���� �߻�
		
		Bus bus = (Bus)car;	//�θ�Ÿ���� �ڽ� Ÿ������ ����ȯ
		bus.run();
		bus.ppangppang();
	}

}
