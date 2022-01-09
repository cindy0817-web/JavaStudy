package MethodExam;

public class ReferenceType {

	public static void main(String[] args) {
		
		ReferenceTypeExam exam = new ReferenceTypeExam();
		
		int value = 10;
		exam.addOne(value);
		System.out.println("기본형 변수의 값을 다른 메소드에서 변경한 결과 : " + value);
		
		int []arr = {10};
		exam.addOne(arr);
		System.out.println("참조형 변수의값을 다른 메소드에서 변경한 결과 : " + arr[0]);
	}

}
