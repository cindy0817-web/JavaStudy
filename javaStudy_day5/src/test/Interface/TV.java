package test.Interface;

//�߻� �޼ҵ�, ��� ���� ����
public interface TV {
	public int MAX_VOLUME = 100;	//�ڵ� ����� ��ȯ
	public int MIN_VOLUME = 0;
	
	public void turnOn();			//�ڵ� �߻�޼ҵ� ��ȯ(abstract)
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}
