package test.Interface2;

public interface Calculator {
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	default int exec(int i, int j) {	//default �޼ҵ� -> ����, �������̵� ����
		return i + j;
		
//		�������̽� ���� ��, ��� Ŭ�������� �ش� �޼ҵ带 �����ؾ��ϴ� ���� �ذ�
	}
	
	public static int exec2(int i, int j) {
		return i + j;
	}
}
