package chap01;

import java.util.Scanner;

public class Exam120 {

	public static void main(String[] args) {
		// 문제1 : 출력문 연습
		String name = "감자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		System.out.println("이름 : " + name);
		System.out.print("나이 : " + age);
		System.out.printf("\n전화 : %s-%s-%s",tel1,tel2,tel3);
		
		//문제2 : scanner 이용 방법 연습
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n첫 번재 수 : ");
		String strNum1 = scanner.nextLine();
		
		System.out.print("두 번재 수 : ");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과 : " + result);
		//추가문제 : 두수를 입력 받아서 큰수 - 작은수
		
		
		//문제3 : scanner 이용 방법 연습
		System.out.print("\n1.이름 : ");
		String uname = scanner.nextLine();
		
		System.out.print("2.주민번호 앞 6자리 : ");
		String num = scanner.nextLine();
		
		System.out.print("3.전화번호 : ");
		String tel = scanner.nextLine();
		
		System.out.printf("\n1.이름 : %s\n", uname);
		System.out.printf("2.주민번호 앞 6자리 : %s\n", num);
		System.out.printf("3.전화번호 : %s\n", tel);

	}

}
