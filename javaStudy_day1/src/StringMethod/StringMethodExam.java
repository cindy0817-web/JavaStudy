package StringMethod;

public class StringMethodExam {

	public static void main(String[] args) {
//		String str = new String("hello");
		String str = "hello";
		
//		.concat : 문자 결합
		System.out.println(str.length());
		System.out.println(str.concat("world"));	//다른 객체 생성
		System.out.println(str);	//불변클래스 성질 -> 바뀌지 x
		
		str = str.concat("world");
		System.out.println(str);
		
//		.substring : 문자 잘라내기
		System.out.println(str.substring(3));	//4번째부터
		System.out.println(str.substring(3, 7));	//4,5,6
	}

}
