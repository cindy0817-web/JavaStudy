package MethodExam;

public class ReferenceTypeExam {
	
	//�⺻�� ���� value
	public void addOne(int value) {
		value++;
	}
	
	//������ ���� arr
	public void addOne(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i]++;
		}
	}
}
