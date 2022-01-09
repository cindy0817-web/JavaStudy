package MethodExam;

public class ReferenceTypeExam {
	
	//기본형 변수 value
	public void addOne(int value) {
		value++;
	}
	
	//참조형 변수 arr
	public void addOne(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i]++;
		}
	}
}
