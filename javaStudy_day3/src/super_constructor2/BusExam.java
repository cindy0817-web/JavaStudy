package super_constructor2;
import java.util.Scanner;

public class BusExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String carName;
		int carNum, carFee;
		
//		�ٶ�, 3000, 1050 �Է�
		System.out.print("> ������ �̸��� �Է��ϼ��� : ");
		name = sc.next();
		
		System.out.printf("> %s���� �������� ���� ������ �Է��ϼ��� : ", name);
		carName = sc.next();
		
		System.out.printf("> %s���� �������� ���� ��ȣ�� �Է��ϼ��� : ", name);
		carNum = sc.nextInt();
		
		System.out.print("> ���� ����� �Է��ϼ��� : ");
		carFee = sc.nextInt();
		
		Bus bus1 = new Bus(carName, carNum, carFee);
		
		if(!bus1.name.equals("�ٶ�"))	// equals() �Լ� --> ������ ��
			System.out.printf("%s���� bus�� name�� �ٸ��ϴ�.", name);
		
		else if(bus1.number != 3000)
			System.out.printf("%s���� bus�� number�� �ٸ��ϴ�.", name);
		
		else {
			System.out.printf("%s���� ������ ��ġ�մϴ�. ������ �غ����ֽʽÿ�.", name);
		}
	}

}
