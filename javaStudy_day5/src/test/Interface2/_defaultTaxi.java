package test.Interface2;

public class _defaultTaxi implements _defaultMeter {

	@Override
	public void start() {
		System.out.println("�ýð� ����մϴ�.");

	}
	
	public void afterMidnight() {
		System.out.println("������ �Ѿ����ϴ�.");
	}

	@Override
	public int stop(int distance) {
		int fare = distance * 2;
		System.out.printf("�ýð� �����߽��ϴ�. ����� %d�Դϴ�.", fare);
		return fare;
	}

}
