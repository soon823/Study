package chap06;

public class Member {
	//필드
	String name;
	String id;
	String password;
	int age;
	//생성자
	Member(){}
	Member(String name,String id){
		this.name = name;
		this.id = id;
	}
	//메소드
	//클래스를 만들때 위에 3개를 넣어야 하지만 필요에 따라 안 넣어도 된다
}
