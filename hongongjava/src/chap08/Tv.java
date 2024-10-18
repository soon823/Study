package chap08;

public class Tv implements Remotecontrol{
	//필드
	private int volume;
	//생성자
	//메소드
	@Override
	public void trunOn() {
		System.out.println("Tv를 켭니다");
		
	}
	
	@Override
	public void trunOff() {
		System.out.println("Tv를 끕니다");
		
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > Remotecontrol.MAX_VOLUME) {
			this.volume = Remotecontrol.MAX_VOLUME;
		}else if(volume < Remotecontrol.MIN_VOLUME) {
			this.volume = Remotecontrol.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Tv 볼륨 : " + this.volume);
	}
}