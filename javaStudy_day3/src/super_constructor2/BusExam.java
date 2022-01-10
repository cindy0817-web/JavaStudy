package super_constructor2;
import java.util.Scanner;

public class BusExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String carName;
		int carNum, carFee;
		
//		뛰뛰, 3000, 1050 입력
		System.out.print("> 고객님의 이름을 입력하세요 : ");
		name = sc.next();
		
		System.out.printf("> %s님이 배정받은 버스 종류를 입력하세요 : ", name);
		carName = sc.next();
		
		System.out.printf("> %s님이 배정받은 버스 번호를 입력하세요 : ", name);
		carNum = sc.nextInt();
		
		System.out.print("> 버스 요금을 입력하세요 : ");
		carFee = sc.nextInt();
		
		Bus bus1 = new Bus(carName, carNum, carFee);
		
		if(!bus1.name.equals("뛰뛰"))	// equals() 함수 --> 같은지 비교
			System.out.printf("%s님의 bus의 name이 다릅니다.", name);
		
		else if(bus1.number != 3000)
			System.out.printf("%s님의 bus의 number가 다릅니다.", name);
		
		else {
			System.out.printf("%s님의 정보와 일치합니다. 승차를 준비해주십시오.", name);
		}
	}

}
