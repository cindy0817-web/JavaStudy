package StringMethod;

public class StringMethodExam {

	public static void main(String[] args) {
//		String str = new String("hello");
		String str = "hello";
		
//		.concat : ���� ����
		System.out.println(str.length());
		System.out.println(str.concat("world"));	//�ٸ� ��ü ����
		System.out.println(str);	//�Һ�Ŭ���� ���� -> �ٲ��� x
		
		str = str.concat("world");
		System.out.println(str);
		
//		.substring : ���� �߶󳻱�
		System.out.println(str.substring(3));	//4��°����
		System.out.println(str.substring(3, 7));	//4,5,6
	}

}
