package MethodExam;

public class ReferenceType {

	public static void main(String[] args) {
		
		ReferenceTypeExam exam = new ReferenceTypeExam();
		
		int value = 10;
		exam.addOne(value);
		System.out.println("�⺻�� ������ ���� �ٸ� �޼ҵ忡�� ������ ��� : " + value);
		
		int []arr = {10};
		exam.addOne(arr);
		System.out.println("������ �����ǰ��� �ٸ� �޼ҵ忡�� ������ ��� : " + arr[0]);
	}

}
