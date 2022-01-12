package test.Interface2;

public class _defaultTaxi implements _defaultMeter {

	@Override
	public void start() {
		System.out.println("택시가 출발합니다.");

	}
	
	public void afterMidnight() {
		System.out.println("자정이 넘었습니다.");
	}

	@Override
	public int stop(int distance) {
		int fare = distance * 2;
		System.out.printf("택시가 도착했습니다. 요금은 %d입니다.", fare);
		return fare;
	}

}
