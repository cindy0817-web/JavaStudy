package stringClass;

public class StringExam {

	public static void main(String[] args) {
		String str1 = "hello";	//메모리 중에서 상수가 저장되는 영역에 저장
		String str2 = "hello";	//str1, str2는 같은 인스턴스 가리킴
		
		String str3 = new String("hello");	//무조건 heap 영역에 따로 만듬
		String str4 = new String("hello");	//str3, str4는 다른 인스턴스 가리킴
		
		if(str1 == str2)
			System.out.println("str1과 str2는 같은 레퍼런스입니다.");
		if(str1 == str3)
			System.out.println("str1과 str2는 같은 레퍼런스입니다.");
		if(str3 == str4)
			System.out.println("str1과 str2는 같은 레퍼런스입니다.");
		
		
		
		System.out.println(str1);
		//string은 불변 클래스
		System.out.println(str1.substring(3));
		System.out.println(str1);
		
		String str5 = "hello world";
		String str6 = str5.substring(3);
		System.out.println(str6);
		System.out.println(str5);
	}

}
