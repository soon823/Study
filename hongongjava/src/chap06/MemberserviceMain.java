package chap06;

public class MemberserviceMain {

	public static void main(String[] args) {
		// 객체생성
		
		Memberservice memberservice = new Memberservice();
		
		boolean result = memberservice.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberservice.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다");
		}
		

	}

}
