package test.Interface2;

public interface _defaultMeter {
	public void start();
	public int stop(int distance);
	
	public default void afterMidnight() {
		System.out.println("자정이 넘었습니다.");
	}
}
