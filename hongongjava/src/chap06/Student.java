package chap06;

public class Student {
	//필드(속성)
	String stNo;
	String name;
	
	//생성자(객체 생성) -> 객체의 속성을 초기화
	Student(String stNo, String name){
		this.stNo = stNo;
		this.name = name;
	}
	
	//메소드(기능)
	void study() {
		System.out.println("공부합니다");
	}
	
	//필드 : 학번 이름 국어 영어 수학 => 객체생성
//	String stNum;
	String stName;
	int ko;
	int en;
	int sansu;
	//생성자 : 필드 초기화
	Student(String stName, int ko, int en, int sansu){
//		this.stNum = stNum;
		this.stName = stName;
		this.ko = ko;
		this.en = en;
		this.sansu = sansu;
	}
	//메소드 : 총점 평균 등급
	int sum() {
		return ko+en+sansu; 
	}
	
	double avg() {
		return (double)sum() / 3;
	}
	
	String grade() {
		switch((int)avg()/10) {
		case 10 :
		case 9 : return "1등급";
		case 8 : return "2등급";
		case 7 : return "3등급";
		case 6 : return "4등급";
		case 5 : return "5등급";
		case 4 : return "6등급";
		case 3 : return "7등급";
		case 2 : return "8등급";
		case 1 : return "9등급";
		default : return "등급이 없습니다.";
		}
	}
	
	
}
