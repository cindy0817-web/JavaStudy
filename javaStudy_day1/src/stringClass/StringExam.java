package stringClass;

public class StringExam {

	public static void main(String[] args) {
		String str1 = "hello";	//�޸� �߿��� ����� ����Ǵ� ������ ����
		String str2 = "hello";	//str1, str2�� ���� �ν��Ͻ� ����Ŵ
		
		String str3 = new String("hello");	//������ heap ������ ���� ����
		String str4 = new String("hello");	//str3, str4�� �ٸ� �ν��Ͻ� ����Ŵ
		
		if(str1 == str2)
			System.out.println("str1�� str2�� ���� ���۷����Դϴ�.");
		if(str1 == str3)
			System.out.println("str1�� str2�� ���� ���۷����Դϴ�.");
		if(str3 == str4)
			System.out.println("str1�� str2�� ���� ���۷����Դϴ�.");
		
		
		
		System.out.println(str1);
		//string�� �Һ� Ŭ����
		System.out.println(str1.substring(3));
		System.out.println(str1);
		
		String str5 = "hello world";
		String str6 = str5.substring(3);
		System.out.println(str6);
		System.out.println(str5);
	}

}
