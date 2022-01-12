package test.Interface;

//추상 메소드, 상수 정의 가능
public interface TV {
	public int MAX_VOLUME = 100;	//자동 상수로 변환
	public int MIN_VOLUME = 0;
	
	public void turnOn();			//자동 추상메소드 변환(abstract)
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}
