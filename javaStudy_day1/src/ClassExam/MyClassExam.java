package ClassExam;

public class MyClassExam {

	public static void main(String[] args) {
		MyClass my1 = new MyClass();
		
		my1.method1();
		
		my1.method2(10);
		
		int x = my1.method3();
		System.out.println("method3�� ������ " + x +" �Դϴ�.");
		
		my1.method4(10, 100);
		
		int x2 = my1.method5(50);
		System.out.println("method5�� ������ " + x2 + "�Դϴ�.");
	}

}
