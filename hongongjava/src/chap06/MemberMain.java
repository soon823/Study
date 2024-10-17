package chap06;

public class MemberMain {

	public static void main(String[] args) {
		//객체생성
		Member member = new Member();
		Member member2 = new Member("홍길동","hong");
		
		System.out.println(member.name + member.age);
		System.out.println(member2.name + member2.id);
		//필드값 변경
		member.name = "최하얀";
		member.age = 23;
		//필드 출력
		System.out.println(member.name);
		System.out.println(member.age);

	}

}
