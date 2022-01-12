package test.Interface2;

public interface Calculator {
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	default int exec(int i, int j) {	//default 메소드 -> 구현, 오버라이딩 가능
		return i + j;
		
//		인터페이스 변경 시, 모든 클래스들이 해당 메소드를 구현해야하는 문제 해결
	}
	
	public static int exec2(int i, int j) {
		return i + j;
	}
}
