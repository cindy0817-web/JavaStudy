package MethodOveloading;

public class MethodOverloadExam {
	
	public static void main(String args[]) {
		MyClass2 m = new MyClass2();
		
		System.out.println(m.plus(5, 10));
		System.out.println(m.plus(5, 10,15));
		System.out.println(m.plus("hello", " world"));
	}
}
