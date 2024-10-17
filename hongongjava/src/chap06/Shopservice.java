package chap06;

public class Shopservice {
	//싱글톤 기법 사용
	//필드 -> 자신의 객체 저장
	private static Shopservice singelton = new Shopservice();
	//생성자 -> 외부 접근 막아야 함
	private Shopservice() {};
	//메소드 -> 외부로 객체 전달
	static Shopservice getInstance() {
		return singelton;
	}
}
