package chap08;

public interface Remotecontrol {
	//상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;	
	
	//추상메소드
	public void trunOn();
	public void trunOff();
	public void setVolume(int volume);
	
	
}