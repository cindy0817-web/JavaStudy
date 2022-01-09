package EnumExam;

public class EnumExam1 {
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";
	public static final double PI = 3.141592;
	
	public static void main(String[] args) {
		String gender1;
		gender1 = EnumExam1.MALE;
		gender1 = EnumExam1.FEMALE;
		
		gender1 = "boy";
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
//		gender2 = boy;
		
		integer a1 = integer.PI;
		
		System.out.println(gender1);	//변수명 출력
		System.out.println(gender2);
		System.out.println(a1);
	}
}

//열거형 : 특정값만 사용 가능
enum Gender{
	MALE, FEMALE;
}

enum integer{
	PI;
}

